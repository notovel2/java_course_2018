package com.example.demo;

import static org.junit.Assert.*;
import book.Book;
import org.junit.Test;

public class BookTest {

	@Test
	public void createBookWithConstructor() {
		Book book1 = new Book("H1",1);
		Book book2 = new Book("H1",1);
		assertEquals(book1, book2);
		assertEquals(book1, book2);
	}

}
