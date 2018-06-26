package book;

public class BookBuilder {
	private String name;
	private int price;
	private int stock;

	public BookBuilder() {
		
	}
	
	public BookBuilder setstock(int stock) {
		this.stock = stock;
		return this;
	}
	
	public BookBuilder setName(String name) {
		this.name = name;
		return this;
	}
	
	public BookBuilder setPrice(int price) {
		this.price = price;
		return this;
	}
	
	public Book build() {
		return new Book(this.name,this.price,this.stock);
	}
}
