package com.genpact.library.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genpact.library.dto.BookDto;
import com.genpact.library.model.Book;
import com.genpact.library.model.Library;
import com.genpact.library.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepository;

	public List<Book> getBooks() {
		return (List<Book>) bookRepository.findAll();
	}

	public Book getBookById(long id) {
		return bookRepository.findById(id).get();
	}

	public Book saveBook(BookDto bookDto) {
		return bookRepository.save(new Book(bookDto.getSubject(), bookDto.getTitle(), bookDto.getAuthor(), bookDto.getPublication(), bookDto.getEdition(), bookDto.getIssueDate(),
				bookDto.getReturnDate(), bookDto.getStudentName(), bookDto.getLibrary()));
	}

	public List<Book> saveBooks(List<BookDto> bookDtos) {
		List<Book> books = new ArrayList<Book>();
		for (BookDto bookDto : bookDtos) {
			books.add(new Book(bookDto.getSubject(), bookDto.getTitle(), bookDto.getAuthor(), bookDto.getPublication(), bookDto.getEdition(), bookDto.getIssueDate(),
					bookDto.getReturnDate(), bookDto.getStudentName(), bookDto.getLibrary()));
		}
		return (List<Book>) bookRepository.saveAll(books);
	}

	public Book updateBook(long id, Book updateBook) {
		Book book = bookRepository.findById(id).get();
		book = updateBook;
		book.setId(id);
		return bookRepository.save(book);
	}
}
