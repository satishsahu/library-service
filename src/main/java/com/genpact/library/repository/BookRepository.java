package com.genpact.library.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.genpact.library.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{

}
