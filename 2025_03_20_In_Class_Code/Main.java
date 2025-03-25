import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		BookList books = new BookList();
		books.addBook("Pride and Prejudice", "Jane Austen");
		books.addBook("It", "Stephen King");
		books.addBook("Till We Have Faces", "C.S. Lewis");
		books.addBook("Carrie", "Stephen King");
		books.addBook("Jane Eyre", "Charlotte Bronte");
		
		books.sortByTitle();
		ArrayList<Book> list = books.getBooks();
		for(Book b : list)
			System.out.println(b);
		
	}
	
}
