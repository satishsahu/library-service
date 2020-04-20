package com.genpact.library;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.genpact.library.service.LibraryService;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class LibraryServiceApplicationTests {

	@Autowired
	private LibraryService libraryService;

	@Test
	public void whenLibraryIdIsProvided_thenRetrievedNameIsCorrect() {
		String testName = libraryService.getLibraryById(1).getName();
		Assert.assertEquals("Higher Education and Professional", testName);
	}
}
