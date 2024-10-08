package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// This annotation tells Spring that this class will handle web requests.
// Entities define the structure of the data that your application will handle. 
// By marking a class as an entity, Spring will map it to a database table, 
// and each instance of the class will correspond to a row in that table.
@Entity // This annotation marks this class as a database entity (table)
public class Post {
    @Id // mark this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // This auto-generate unique IDs for new posts
    private Long id;

    private String title;
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
