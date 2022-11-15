package com.gotbizlogic.demo.of.incompleteCodeBase.repos;

import com.gotbizlogic.demo.of.incompleteCodeBase.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends CrudRepository<Book, Long> {
    Iterable<Book> findByAuthorId(Long authorId);
}
