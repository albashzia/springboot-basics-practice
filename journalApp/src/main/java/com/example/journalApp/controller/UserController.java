 package com.example.journalApp.controller;


 import com.example.journalApp.entity.User;
 import com.example.journalApp.service.UserService;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.*;

 import java.util.List;

 @RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService userService;


  @GetMapping
  public List<User> getAllUsers(){
   return userService.getAll();
  }

  @PostMapping
  public void createUser(@RequestBody User user){
   userService.saveEntry(user);
  }
}
