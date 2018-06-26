package book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Order {
	private double discount;
	private int amountOfBook;
	private double totalPrice;
	private double netPrice;
	private ArrayList<BookItem> bookItems;
	private double[] discountPercentageArray = {0,5,10,20,25};
	
	private double getDiscountRate(int diffAmount) {
		return discountPercentageArray[diffAmount]/100;
	}
	
	public void addItem(BookItem bookItem) {

		if (bookItem != null) {
			bookItems.add(bookItem);
		}
	}

	public Order() {
		this.bookItems = new ArrayList<BookItem>();
		resetValue();
	}
	
	private void resetValue() {
		this.discount = 0;
		this.amountOfBook = 0;
		this.totalPrice = 0;
		this.netPrice = 0;
	}
	
	public void process() {
		int diffAmount = 0;
		resetValue();
		for (BookItem item : bookItems) {
			this.amountOfBook += item.getAmount();
			this.totalPrice += item.getAmount() * item.getBook().getPrice();
			diffAmount++;
		}
		this.discount =  this.totalPrice * getDiscountRate(diffAmount);
		this.netPrice = this.totalPrice - this.discount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getAmountOfBook() {
		return amountOfBook;
	}

	public void setAmountOfBook(int amountOfBook) {
		this.amountOfBook = amountOfBook;
	}	

	public ArrayList<BookItem> getBookItems() {
		return bookItems;
	}

	public void setBookItems(ArrayList<BookItem> bookItems) {
		this.bookItems = bookItems;
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
