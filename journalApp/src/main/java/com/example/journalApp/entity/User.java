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

// Maps this Java class to a MongoDB collection named "users"
@Document(collection = "users")

// Automatically generates methods, using Lombok
@Data
public class User {

    @Id // Defines the field as primary identifier
    private ObjectId id;

    @Indexed(unique = true) // Creates a unique index in MongoDB for this field
    @NonNull // Ensures this field is not null
    private String userName;

    @NonNull //Ensures that this field is not null
    private String password;

    @DBRef // Establish reference between user and journal entry documents
    private List<JournalEntry> journalEntries = new ArrayList<>();

}
