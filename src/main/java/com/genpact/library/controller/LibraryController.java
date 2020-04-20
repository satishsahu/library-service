package com.genpact.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.genpact.library.model.Library;
import com.genpact.library.service.LibraryService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LibraryController {

	@Autowired
	LibraryService libraryService;
	
	@GetMapping("/libraries")
	public ResponseEntity<List<Library>> getLibraries(){
		return new ResponseEntity<List<Library>>(libraryService.getLibraries(), HttpStatus.OK);
	}
	
	@GetMapping("/library/{id}")
	public Library getLibraryById(@PathVariable long id){
		return libraryService.getLibraryById(id);
	}
	
	@PostMapping("/library")
	public Library saveLibrary(@RequestBody Library library){
		return libraryService.saveLibrary(library);
	}
	
	@PostMapping("/libraries")
	public List<Library> saveLibraries(@RequestBody List<Library> libraries) {
		return libraryService.saveLibraries(libraries);
	}
	
	@PutMapping("/library/{id}")
	public Library updateLibrary(@PathVariable long id, @RequestBody Library library){
		return libraryService.updateLibrary(id, library);
	}
}
