 package com.example.journalApp.controller;


import com.example.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {


    @GetMapping
    public List<JournalEntry> getAll(){
        return null;
    }

    @GetMapping("/id/{myId}")
    public JournalEntry getEntryById(@PathVariable Long myId){
        return null;
    }
    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        return true;
    }

    @PutMapping("/id/{myId}")
    public JournalEntry updateEntryById(@PathVariable Long myId, @RequestBody JournalEntry myEntry){
        return null;
    }
    @DeleteMapping("/id/{myId}")
    public JournalEntry deleteEntryById(@PathVariable Long myId){
        return null;
    }
}
