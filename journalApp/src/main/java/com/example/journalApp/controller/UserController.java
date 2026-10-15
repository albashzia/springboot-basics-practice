 package com.example.journalApp.controller;


 import com.example.journalApp.entity.User; // Imports the User entity class.
 import com.example.journalApp.service.UserService; // Imports UserService, which contains the business logic for user operations.
 import org.springframework.beans.factory.annotation.Autowired; // Imports @Autowired, which allows Spring to inject a required dependency.
 import org.springframework.http.HttpStatus; // Imports HTTP status codes such as 200 OK, 201 CREATED, and 204 NO_CONTENT.
 import org.springframework.http.ResponseEntity; // Imports ResponseEntity, which lets us control the HTTP response status, headers, and body returned to the client.
 import org.springframework.web.bind.annotation.*;

 import java.util.List;

 @RestController //Marks this class as REST controller
@RequestMapping("/user") // Sets the base URL for every endpoint in this controller
public class UserController {

     // Injects UserService object in this field
  @Autowired
  private UserService userService;


  //Handles HTTP GET requests
  @GetMapping
  //Returns a list of all users
  public List<User> getAllUsers(){
   return userService.getAll();
  }

  //Handles HTTP POST requests
  @PostMapping
  //Used to create a new user
  public void createUser(@RequestBody User user){
   userService.saveEntry(user);
  }

  //Handles HTTP POST requests
  @PutMapping("/{userName}")

  public ResponseEntity<?> updateUser(@RequestBody User user,@PathVariable String userName){
      User userInDb = userService.findByUserName(userName);
      if (userInDb != null){
          userInDb.setUserName(user.getUserName());
          userInDb.setPassword(user.getPassword());
          userService.saveEntry(userInDb);
      }
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}
