package com.example.journalApp.controller;


import com.example.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class JournalEntryController {

    private Map<Long,JournalEntry> journalEntries = new HashMap<>();

    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }
}
