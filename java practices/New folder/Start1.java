import java.lang.*;
public class Start1 {
	public static void main(String[] args) {
		StoryBook book1 = new StoryBook();
		book1.setIsbn("1234");
		book1.setBookTitle("Naruto");
		book1.setAuthorName("Masashi Kishimoto");
		book1.setPrice(50.0);
		book1.setAvailableQuantity(5000);
		book1.addQuantity(200);
		book1.showDetails();
	}
}
