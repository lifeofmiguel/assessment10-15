package com.gotbizlogic.demo.of.incompleteCodeBase.controllers;

import com.gotbizlogic.demo.of.incompleteCodeBase.models.Author;
import com.gotbizlogic.demo.of.incompleteCodeBase.repos.AuthorRepo;
import com.gotbizlogic.demo.of.incompleteCodeBase.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthorController {

    @Autowired
    private AuthorRepo authorRepo;

    @Autowired
    private AuthorService authorService;

    @PostMapping("/authors")
    public ResponseEntity<Author> createAuthor(@RequestBody Author author){
        return new ResponseEntity<>(authorService.createAuthor(author), HttpStatus.CREATED);
    }

    @GetMapping("/authors")
    public ResponseEntity<Iterable<Author>> getAllAuthors(@RequestParam(required = false) String name){
        return new ResponseEntity<>(authorService.getAllAuthors(name), HttpStatus.OK);
    }




}
