package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

import book.Book;
import book.BookBuilder;
import book.BookItem;
import book.Order;

public class OrderTest {

	@Test
	public void createOrderWithOneBook() {
		Book book1 = new BookBuilder().setName("H1").setPrice(8).setstock(2).build();
		BookItem bookItem = new BookItem(book1, 1);

		Order order = new Order();
		order.addItem(bookItem);
		order.process();
		
		assertEquals(1, order.getSizeOfBook());

		assertEquals(8, order.getTotalPrice(), 2);

		assertEquals(0, order.getDiscount(), 2);

		assertEquals(8, order.getNetPrice(), 2);
	}

	@Test
	public void createEmptyOrder() {
		Order order = new Order();
		assertEquals(0, order.getSizeOfBook());

		assertEquals(0, order.getTotalPrice(), 2);

		assertEquals(0, order.getDiscount(), 2);

		assertEquals(0, order.getNetPrice(), 2);

	}

}
