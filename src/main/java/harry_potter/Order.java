package harry_potter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Order {
	private List<BookItem> bookList = new ArrayList<BookItem>();
	private double netPrice = 0;

	public Order() {
		bookList = new ArrayList<BookItem>();
	}

	public static void main(String[] args) {
		Order order = new Order();
		order.addOrder(new Book("H1", 8.0), 2);
		order.addOrder(new Book("H2", 8.0), 2);
		order.addOrder(new Book("H3", 8.0), 8);
		order.addOrder(new Book("H4", 8.0), 1);
		order.addOrder(new Book("H5", 8.0), 1);
		order.advanceProcess();
		System.out.println(order.getNetPrice());
	}

	private int circleIncrement(int i, int max) {
		return (i + 1 >= max) ? 0 : i + 1;
	}
	
	private double advanceCaluculateNetPrice(List<GroupOfBook> groupOfBookList, double[] discountRateArray) {
		for (GroupOfBook item : groupOfBookList) {
			item.addDiscount(discountRateArray[item.getQuantity()] / 100);
			double totalPriceForEachGroup = item.getTotalPrice();
			double discount = totalPriceForEachGroup * item.getTotalDiscountRate();
			netPrice += totalPriceForEachGroup - discount;
		}
		return netPrice;
	}
	
	private List<GroupOfBook> advanceDivideBookIntoGroups(List<GroupOfBook> groupOfBookList) {
		Collections.sort(bookList, Collections.reverseOrder());
		for (int i = 0, groupIndex = -1, kindOfBook = bookList.size(); !bookList.isEmpty(); i = circleIncrement(i,
				kindOfBook)) {
			if (bookList.get(i).getQuantity() > 0) {

				if (groupOfBookList.isEmpty() || groupOfBookList.get(groupIndex).isMaxSize(4)) {
					groupOfBookList.add(new GroupOfBook());
					groupIndex++;
				}

				groupOfBookList.get(groupIndex).addBook(bookList.get(i).getBook());
				bookList.get(i).decreaseQuantity(1);
			} else {
				bookList.remove(i);
			}
			kindOfBook = bookList.size();
		}

		return groupOfBookList;
	}

	public void advanceProcess() {
		double[] discountRateArray = { 0, 0, 5, 10, 20, 25 };
		List<GroupOfBook> temp = new ArrayList<GroupOfBook>();
		temp = advanceDivideBookIntoGroups(temp);
		advanceCaluculateNetPrice(temp, discountRateArray);
	}

	public void process() {
		List<GroupOfBookItem> temp = new ArrayList<GroupOfBookItem>();
		double[] discountRateArray = { 0, 0, 5, 10, 20, 25 };

		temp = divideBookIntoGroups(temp);

		calculateNetPrice(temp, discountRateArray);

	}

	private List<GroupOfBookItem> divideBookIntoGroups(List<GroupOfBookItem> groupOfBookList) {
		int kindOfBook = bookList.size();
		for (int i = 0; i < kindOfBook; i++) {
			BookItem newBookItem = bookList.get(i);
			double newBookItemPrice = newBookItem.getBook().getPrice();

			int currentQuantity = bookList.get(i).getQuantity();
			for (int j = 0; j < currentQuantity; j++) {
				if (groupOfBookList.isEmpty() || j >= groupOfBookList.size()) {
					groupOfBookList.add(new GroupOfBookItem(0.0, 0.0, 0));
				}
				groupOfBookList.get(j).addQuantity(1);
				groupOfBookList.get(j).addPrice(newBookItemPrice);
			}
		}
		return groupOfBookList;
	}

	private double calculateNetPrice(List<GroupOfBookItem> temp, double[] discountRateArray) {
		for (GroupOfBookItem item : temp) {
			item.addDiscount(discountRateArray[item.getQuantity()] / 100);
			double totalPriceForEachGroup = item.getTotalPrice();
			double discount = totalPriceForEachGroup * item.getTotalDiscountRate();
			netPrice += totalPriceForEachGroup - discount;
		}
		return netPrice;
	}

	public void addOrder(Book book, int quantity) {
		BookItem newBookItem = new BookItem(book, quantity);

		if (bookList.contains(newBookItem)) {
			int index = bookList.indexOf(newBookItem);
			bookList.get(index).addQuantity(quantity);
		} else {
			bookList.add(newBookItem);
		}

	}

	public double getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}

}
