package com.genpact.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genpact.library.model.Library;
import com.genpact.library.repository.LibraryRepository;

@Service
public class LibraryService {

	@Autowired
	LibraryRepository libraryRepository;

	public List<Library> getLibraries() {
		return (List<Library>) libraryRepository.findAll();
	}

	public Library getLibraryById(long id) {
		return libraryRepository.findById(id).get();
	}

	public Library saveLibrary(Library library) {
		return libraryRepository.save(library);
	}

	public List<Library> saveLibraries(List<Library> libraries) {
		return (List<Library>) libraryRepository.saveAll(libraries);
	}
	
	public Library updateLibrary(long id, Library updateLibrary) {
		Library library = libraryRepository.findById(id).get();
		library = updateLibrary;
		library.setId(id);
		return libraryRepository.save(library);
	}
}
