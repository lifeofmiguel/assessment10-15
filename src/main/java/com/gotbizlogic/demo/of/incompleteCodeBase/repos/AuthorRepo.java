package com.gotbizlogic.demo.of.incompleteCodeBase.repos;

import com.gotbizlogic.demo.of.incompleteCodeBase.models.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo extends CrudRepository<Author, Long> {
    Iterable<Author> findByNameContaining(String name);
}
