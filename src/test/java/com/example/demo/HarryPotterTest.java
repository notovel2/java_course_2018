package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

import harry_potter.Order;

import harry_potter.Book;

public class HarryPotterTest {

	@Test
	public void test1() {
		Order order = new Order();
		order.addOrder(new Book("H1",8.0), 2);
		order.addOrder(new Book("H2",8.0), 2);
		order.addOrder(new Book("H3",8.0), 2);
		order.addOrder(new Book("H4",8.0), 1);
		order.addOrder(new Book("H5",8.0), 1);
		double price = order.calculatePrice();
		assertEquals(51.60, price,2);
	}
	
	@Test
	public void test2() {
		Order order = new Order();
		order.addOrder(new Book("H1",8.0), 5);
		order.addOrder(new Book("H2",8.0), 4);
		order.addOrder(new Book("H3",8.0), 3);
		order.addOrder(new Book("H4",8.0), 4);
		order.addOrder(new Book("H5",8.0), 6);
		double price = order.calculatePrice();
		assertEquals(138.80, price,2);
	}

}
