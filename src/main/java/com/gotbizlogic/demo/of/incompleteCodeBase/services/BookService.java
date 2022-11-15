package com.gotbizlogic.demo.of.incompleteCodeBase.services;

import com.gotbizlogic.demo.of.incompleteCodeBase.models.Book;
import com.gotbizlogic.demo.of.incompleteCodeBase.repos.AuthorRepo;
import com.gotbizlogic.demo.of.incompleteCodeBase.repos.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class BookService {

        /*
            //THIS IS THE ONLY FILE YOU SHOULD WRITE CODE
            //THIS IS WHERE YOUR LOGIC COMES INTO PLAY
            //DO NOT TOUCH THE CONTROLLER OR MODELS OR REPOS!!!
        */

    @Autowired
    private AuthorRepo authorRepo;
    @Autowired
    private BookRepo bookRepo;


    //Todo - Business Logic or Algorithm needed to create a book
    public Book createBook(Long authorId, Book book){
        authorRepo.findById(authorId).map(author ->{
            book.setAuthor(author);
            return bookRepo.save(book);
        });
        return book;
    }

    //Todo - Business Logic or Algorithm needed to getAllBooksByAuthorId
    public Iterable<Book> getAllBooksByAuthorId(Long authorId) {
        return bookRepo.findByAuthorId(authorId);
    }

    //Todo - Business Logic or Algorithm needed to getBookById
    public Optional<Book> getBookById(Long bookId) {
        return Optional.ofNullable(bookRepo.findById(bookId).orElse(null));
        // Book b = bookRepo.findById(bookId).orElse(null);
        //return new Optional(b,HttpStatus.OK);
    }

}
