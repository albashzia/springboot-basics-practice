package com.example.journalApp.entity;

import lombok.Data; // Imports Lombok's @Data annotation to generate boilerplate code
import lombok.NonNull; // Enforces non-null constraints and generate null-checks
import org.bson.types.ObjectId; // Imports MongoDB's specific ObjectId type used for unique document IDs
import org.springframework.data.annotation.Id; // Designate a field as the primary key
import org.springframework.data.mongodb.core.index.Indexed; // Create database indexes for performance and uniqueness
import org.springframework.data.mongodb.core.mapping.DBRef; // Handle references/relationships between different documents
import org.springframework.data.mongodb.core.mapping.Document; // Map this Java class to a MongoDB collection

import java.util.ArrayList;
import java.util.List;

@Document(collection = "users")
@Data
public class User {

    @Id
    private ObjectId id;
    @Indexed(unique = true)
    @NonNull
    private String userName;
    @NonNull
    private String password;
    @DBRef
    private List<JournalEntry> journalEntries = new ArrayList<>();

}
