package com.example.demo;
// The repository is the layer responsible for interacting with the database. 
// Spring Boot simplifies this by allowing you to define a repository interface, 
// and it will automatically provide implementations for basic CRUD operations.
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    // JpaRepository<Post, Long>: This interface extends JpaRepository,
    // which provides basic CRUD (Create, Read, Update, Delete) methods. 
    // The first parameter (Post) is the entity type, and the second (Long) 
    // is the type of the primary key (id).
    // JpaRepository provides built-in methods like findAll(), findById(), save(), and deleteById()
}
