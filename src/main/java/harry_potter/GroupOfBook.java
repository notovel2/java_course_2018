package harry_potter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GroupOfBook{
	private double totalPrice;
	private double totalDiscountRate;
	private int quantity;
	private List<Book> groupBookItemList;

	public GroupOfBook() {
		groupBookItemList = new ArrayList<Book>();
	}
	
	public void addBook(Book book) {
		groupBookItemList.add(book);
		quantity++;
		totalPrice += book.getPrice();
	}

	public void addDiscount(double discountRate) {
		if(totalDiscountRate != 0) {
			totalDiscountRate *= discountRate;
		}
		else {
			totalDiscountRate = discountRate;
		}
	}
	
	public boolean isMaxSize(int maxSize) {
		return groupBookItemList.size() >= maxSize;
	}

	public boolean isContains(Book book) {
		return groupBookItemList.contains(book);
	}

	
	
	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getTotalDiscountRate() {
		return totalDiscountRate;
	}

	public void setTotalDiscountRate(double totalDiscountRate) {
		this.totalDiscountRate = totalDiscountRate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public List<Book> getGroupBookItemList() {
		return groupBookItemList;
	}

	public void setGroupBookItemList(List<Book> groupBookItemList) {
		this.groupBookItemList = groupBookItemList;
	}

	
	
	


}
