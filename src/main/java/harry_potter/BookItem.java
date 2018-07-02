package harry_potter;

public class BookItem {
	private int quantity;
	private Book book;
	
	public void addQuantity(int quantity) {
		this.quantity += quantity;
	}
	
	public BookItem(String bookName, double price, int quantity) {
		book = new Book(bookName, price);
		this.quantity = quantity;
	}
	
	public BookItem(Book book, int quantity) {
		this.book = book;
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((book == null) ? 0 : book.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookItem other = (BookItem) obj;
		if (book == null) {
			if (other.book != null)
				return false;
		} else if (!book.equals(other.book))
			return false;
		return true;
	}

}
