import java.util.ArrayList;
import java.util.Collections;

public class Client {
	public static void main(String[] args) {
		BookList listOfBooks = new BookList();
		listOfBooks.addBook(new Book("It", "Stephen King"));
		listOfBooks.addBook(new Book("Dracula", "Bram Stoker"));
		listOfBooks.addBook(new Book("The Book Thief", "Markus Zusak"));
		listOfBooks.addBook(new Book("The Wheel on the School", "Meindert DeJong"));
		listOfBooks.addBook(new Book("Under the Dome", "Stephen King"));
		
		ArrayList<Book> booksByAuthor = listOfBooks.getBooksByAuthor();
		
		System.out.println("Sorted by Author first:\n");
		for(Book b: booksByAuthor)
			System.out.println(b);
		
		ArrayList<Book> booksByTitle = listOfBooks.getBooksByTitle();
		
		System.out.println("Sorted by Title first:\n");
		for(Book b: booksByTitle)
			System.out.println(b);
	}
}
