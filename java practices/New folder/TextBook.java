import java.lang.*;
// TextBook.java
public class TextBook extends Book {
	private int standard;

	public TextBook() {
		System.out.println("TextBook default constructor calling");
	}

	public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard) {
		super(isbn, bookTitle, authorName, price, availableQuantity);
		this.standard = standard;
	}

	public void setStandard(int standard) { this.standard = standard; }
	public int getStandard() { return standard; }
}
