package com.example.journalApp.entity;

import lombok.Data; // Imports Lombok's Data annotation to generate boilerplate code
import lombok.NoArgsConstructor; // Generate a default no-argument constructor
import lombok.NonNull; // Enforces non-null constraints and generate null-checks
import org.bson.types.ObjectId; // Imports MongoDB's native unique identifier type
import org.springframework.data.annotation.Id; // Annotation to designate the primary key field
import org.springframework.data.mongodb.core.mapping.Document; // Annotation to map this class to a database collection

import java.time.LocalDateTime; // Import Java's date and time API for tracking timestamps

// Maps this class to a MongoDB collection named "journal_entries"
@Document(collection = "journal_entries")
@Data
@NoArgsConstructor
public class JournalEntry {

    @Id
    private ObjectId id;
    @NonNull
    private String title;
    private String content;
    private LocalDateTime date;

}
