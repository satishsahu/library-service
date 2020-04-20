package com.genpact.library.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.genpact.library.model.Library;

@Repository
public interface LibraryRepository extends CrudRepository<Library, Long> {

}
