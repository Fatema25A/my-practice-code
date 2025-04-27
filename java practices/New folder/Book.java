import java.lang.*;
public class book
{
	private String isbn;
	private String BookTitle;
	private String authorName;
	private double price;
	private int availablequantity;
	public book()
	{
		System.out.println("Book d,c calling");
	}
	public book(String isbn,String BookTitle,String authorName,double price,int availablequantity)
	{
		this.isbn=isbn;
		this.BookTitle=BookTitle;
		this.authorName=authorName;
		this.price=price;
		this.availablequantity=availablequantity;
		System.out.println("Book pc calling");
	}
	public void setAuthorName(String authorName)
	{
		this.authorName=authorName;
	}
	public void setisbn(String isbn)
	{
		this.isbn=isbn;
	}
	public void setBookTitle(String BookTitle)
	{
		this.BookTitle=BookTitle;
	}
	public void setprice(double price)
	{
		this.price=price;
	}
	public String getisbn()
	{
		return isbn;
	}
	public String getBookTitle()
	{
		return BookTitle;
	}
	public String getauthorName()
	{
	return authorName;
	}
	public double getprice()
	{
		return price;
	}
	public void addQuantity()
	{
		this.availablequantity=availablequantity+amount;
	}
	public void sellquantity()
	{
		this.availablequantity=availablequantity-amount;
	}
	public void ShowDetails()
	{
		System.out.println("Book isbn is: "+this.isbn);
		System.out.println("Book title: "+this.getBookTitle);
	System.out.println("Book authorName: "+this.authorName);
		System.out.println("Book price: "+this.price);
		System.out.println("Book availablequantity: "+this.availablequantity);
}}