package com.gotbizlogic.demo.of.incompleteCodeBase.controllers;
import com.gotbizlogic.demo.of.incompleteCodeBase.models.Book;
import com.gotbizlogic.demo.of.incompleteCodeBase.repos.AuthorRepo;
import com.gotbizlogic.demo.of.incompleteCodeBase.repos.BookRepo;
import com.gotbizlogic.demo.of.incompleteCodeBase.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

/*
    //HELLO PLEASE READ ME CAREFULLY!!!
    //YOU CANNOT MODIFY THE CODE IN HERE. THE DEVELOPER THAT WROTE IT WILL BE UNHAPPY.
    // THE CODE WORKS. LEAVE IT ALONE EXCEPT TO TEST THINGS OUT
    //DO NOT ADD OR REMOVE FROM THIS FILE. YOUR WORK IS TO BE DONE IN THE SERVICE LAYER. THANKS
 */

@RestController
public class BookController {


    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private AuthorRepo authorRepo;

    @Autowired
    private BookService bookService;


    //getAllBooksByAuthorId
    @GetMapping("/authors/{authorId}/books")
    public ResponseEntity<Iterable<Book>> getAllBooksByAuthorId(@PathVariable(value = "authorId") Long authorId) {
        return new ResponseEntity<>(bookService.getAllBooksByAuthorId(authorId), HttpStatus.OK);
    }


    @PostMapping("/authors/{authorId}/books")
    public ResponseEntity<Book> createBook(@PathVariable(value = "authorId") Long authorId, @RequestBody Book bookRequest) {
        return new ResponseEntity<>(bookService.createBook(authorId, bookRequest), HttpStatus.CREATED);
    }



    //TO DO: getBookById
    @GetMapping("/books/{id}")
    public ResponseEntity<Optional<Book>> getBookById(@PathVariable(value = "id") Long id) {
        Optional<Book> book = bookService.getBookById(id);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }


}
