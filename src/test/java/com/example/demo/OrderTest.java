package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

import book.Book;
import book.BookBuilder;
import book.BookItem;
import book.Order;

public class OrderTest {

	@Test
	public void createOrderWithTwoBook() {
		Book book1 = new BookBuilder().setName("H1").setPrice(8).setstock(2).build();
		Book book2 = new BookBuilder().setName("H2").setPrice(8).setstock(2).build();
		BookItem bookItem1 = new BookItem(book1, 1);
		BookItem bookItem2 = new BookItem(book2, 1);
		
		Order order = new Order();
		order.addItem(bookItem1);
		order.addItem(bookItem2);
		order.process();
		
		assertEquals(2, order.getAmountOfBook());

		assertEquals(16, order.getTotalPrice(), 2);

		assertEquals(0.8, order.getDiscount(), 2);

		assertEquals(15.2, order.getNetPrice(), 2);
	}
	
	@Test
	public void createOrderWithOneBook() {
		Book book1 = new BookBuilder().setName("H1").setPrice(8).setstock(2).build();
		BookItem bookItem = new BookItem(book1, 1);

		Order order = new Order();
		order.addItem(bookItem);
		order.process();
		assertEquals(1, order.getAmountOfBook());

		assertEquals(8, order.getTotalPrice(), 2);

		assertEquals(0, order.getDiscount(), 2);

		assertEquals(8, order.getNetPrice(), 2);
	}

	@Test
	public void createEmptyOrder() {
		Order order = new Order();
		assertEquals(0, order.getAmountOfBook());

		assertEquals(0, order.getTotalPrice(), 2);

		assertEquals(0, order.getDiscount(), 2);

		assertEquals(0, order.getNetPrice(), 2);

	}

}
