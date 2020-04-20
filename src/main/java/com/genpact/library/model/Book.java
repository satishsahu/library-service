package com.genpact.library.model;

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

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8604009823952700288L;

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

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "library_id", nullable = false)
	private Library library;

	public Book() {
	}

	public Book(String subject, String title, String author, String publication, int edition, Date issueDate,
			Date returnDate, String studentName, Library library) {
		super();
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
