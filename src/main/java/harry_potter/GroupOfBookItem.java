package harry_potter;

public class GroupOfBookItem {
	private double totalPrice;
	private double totalDiscountRate;
	private int quantity;

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

	public GroupOfBookItem(double totalPrice, double totalDiscountRate, int quantity) {
		super();
		this.totalPrice = totalPrice;
		this.totalDiscountRate = totalDiscountRate;
		this.quantity = quantity;
	}
	
	public void addQuantity(int quantity) {
		this.quantity += quantity;
	}
	
	public void addPrice(double price) {
		this.totalPrice += price;
	}
	
	public void addDiscount(double discountRate) {
		if(totalDiscountRate != 0) {
			totalDiscountRate *= discountRate;
		}
		else {
			totalDiscountRate = discountRate;
		}
	}
}
