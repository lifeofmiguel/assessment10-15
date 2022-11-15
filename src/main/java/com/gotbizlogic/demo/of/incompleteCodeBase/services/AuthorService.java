package com.gotbizlogic.demo.of.incompleteCodeBase.services;

import com.gotbizlogic.demo.of.incompleteCodeBase.models.Author;
import com.gotbizlogic.demo.of.incompleteCodeBase.repos.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AuthorService {
    /*
        //THIS IS THE ONLY FILE YOU SHOULD WRITE CODE
        //THIS IS WHERE YOUR LOGIC COMES INTO PLAY
        //DO NOT TOUCH THE CONTROLLER OR MODELS OR REPOS!!!
     */

    @Autowired
    private AuthorRepo authorRepo;


    //Todo - Business Logic or Algorithm needed to create an author
//    public Author createAuthor(Author author){
//        return authorRepo.save(author);
//    }
    public ResponseEntity<Author> createAuthor(Author author){
        return authorRepo.save(author);
    }

    //Todo - Business Logic or Algorithm needed to GetAll authors and to also be able to Search for an author by name
    public ResponseEntity <Iterable<Author>> getAllAuthors(String name) {
        Iterable<Author> getAuthors = authorRepo.findAll();
        return new ResponseEntity<>(authorRepo.findAll(), HttpStatus.OK);
    }


}
