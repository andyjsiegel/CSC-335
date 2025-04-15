import java.util.ArrayList;
import java.util.Collections;

public class BookList {
	private ArrayList<Book> bookList;
	
	public BookList() {
		this.bookList = new ArrayList<Book>();
	}
	
	public void addBook(Book book) {
		this.bookList.add(book);
	}
	
	public ArrayList<Book> getBooksByTitle() {
		ArrayList<Book> listCopy = new ArrayList(bookList);
		Collections.sort(listCopy,Book.titleFirstComparator());
		return listCopy;
	}
	
	public ArrayList<Book> getBooksByAuthor() {
		ArrayList<Book> listCopy = new ArrayList(bookList);
		Collections.sort(listCopy,Book.authorFirstComparator());
		return listCopy;
	}
}
