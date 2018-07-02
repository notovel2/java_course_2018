package harry_potter;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<BookItem> bookList = new ArrayList<BookItem>();
	private double netPrice = 0;

	public Order() {
		bookList = new ArrayList<BookItem>();
	}

	public double calculatePrice() {
		List<GroupOfBookItem> temp = new ArrayList<GroupOfBookItem>();
		double[] discountRateArray = { 0, 0, 5, 10, 20, 25 };
		int kindOfBook = bookList.size();
		
		for (int i = 0; i < kindOfBook; i++) {
			BookItem newBookItem = bookList.get(i);
			double newBookItemPrice = newBookItem.getBook().getPrice();

			int currentQuantity = bookList.get(i).getQuantity();
			for (int j = 0; j < currentQuantity; j++) {
				if (temp.isEmpty() || j >= temp.size()) {
					temp.add(new GroupOfBookItem(0.0, 0.0, 0));
				}
				temp.get(j).addQuantity(1);
				temp.get(j).addPrice(newBookItemPrice);
			}
		}
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

}
