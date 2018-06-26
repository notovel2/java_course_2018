package book;

import java.util.HashMap;

public class Order {
	private double discount;
	private int sizeOfBook;
	private double totalPrice;
	private double netPrice;

	public void addItem(BookItem bookItem) {
		this.sizeOfBook += bookItem.getAmount();

	}

	public Order() {
		this.discount = 0;
		this.sizeOfBook = 0;
		this.totalPrice = 0;
		this.netPrice = 0;
	}

	public void process() {
		this.totalPrice = this.sizeOfBook * 8;
		this.netPrice = this.totalPrice - this.totalPrice * this.discount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getSizeOfBook() {
		return sizeOfBook;
	}

	public void setSizeOfBook(int sizeOfBook) {
		this.sizeOfBook = sizeOfBook;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}
}
