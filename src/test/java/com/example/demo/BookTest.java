package com.example.demo;

import static org.junit.Assert.*;
import book.Book;
import book.BookBuilder;

import org.junit.Test;

public class BookTest {

	@Test
	public void createBookWithConstructor() {
		Book book1 = new BookBuilder()
				.setName("H1")
				.setPrice(20)
				.build();
		Book book2 = new BookBuilder()
				.setName("H1")
				.setPrice(20)
				.build();
		assertEquals(book1, book2);
	}

}
