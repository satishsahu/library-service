package com.genpact.library.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.genpact.library.model.Library;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookDto implements Serializable {

	private static final long serialVersionUID = -1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String subject;
	private String title;
	private String author;
	private String publication;
	private int edition;
	private Date issueDate;
	private Date returnDate;
	private String studentName;
	private Library library;

	public BookDto() {
	}

	public BookDto(long id, String subject, String title, String author, String publication, int edition,
			Date issueDate, Date returnDate, String studentName, Library library) {
		super();
		this.id = id;
		this.subject = subject;
		this.title = title;
		this.author = author;
		this.publication = publication;
		this.edition = edition;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
		this.studentName = studentName;
		this.library = library;
	}

}
