package com.genpact.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.genpact.library.dto.BookDto;
import com.genpact.library.model.Book;
import com.genpact.library.service.BookService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping("/books")
	public List<Book> getBooks(){
		return bookService.getBooks();
	}
	
	@GetMapping("/book/{id}")
	public Book getBookById(@PathVariable long id){
		return bookService.getBookById(id);
	}
	
	@PostMapping("/book")
	public Book saveBook(@RequestBody BookDto book){
		return bookService.saveBook(book);
	}
	
	@PostMapping("/books")
	public List<Book> saveBooks(@RequestBody List<BookDto> books){
		return bookService.saveBooks(books);
	}
	
	@PutMapping("/book/{id}")
	public Book updateBook(@PathVariable long id, @RequestBody Book book){
		return bookService.updateBook(id, book);
	}
}
