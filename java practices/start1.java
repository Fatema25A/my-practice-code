import java.lang.*;
public class start1
{
	public static void main(String[] args)
	{
		Book b1=new Book("1234567","java Programming","John",29.99,100);
		b1.addQuantity(5);
		b1.sellQuantity(3);
		
		Book b2=new Book();
		b2.setIsbn("789101");
		b2.setBookTitle("OOP Concepts");
		b2.setAuthorName("jane Smith");
		b2.setAvailableQuantity(5);
		b2.addQuantity(2);
		b2.sellQuantity(1);
		System.out.println("Book 1 detail: ");
		b1.showDetails();
		System.out.println("Book 2 details: ");
		b2.showDetails();
		
		
		
		
		
	}
}