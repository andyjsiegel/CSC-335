import java.util.ArrayList;
import java.util.Collections;

public class LibraryModel {
	/* INSTANCE VARIABLES */
	private ArrayList<Book> bookList;
	
	/* CONSTRUCTOR */
	public LibraryModel() {
		this.bookList = new ArrayList<Book>();
	}
	
	/* METHODS */
	
	//add a book to the library based on the title and author
	public void addBook(String title, String author) {
		bookList.add(new Book(title, author));
	}
	
	//return a Book with the given title
	public Book getBookByTitle(String title) {
		for(Book b : bookList) {
			if(b.getTitle().equals(title))
				return b;
		}
		return null;
	}
	
	//return a Book with the given author
	public Book getBookByAuthor(String author) {
		for(Book b : bookList) {
			if(b.getAuthor().equals(author))
				return b;
		}
		return null;
	}
	
	//return a list of books with the given rating
	public ArrayList<Book> getBooksByRating(int rating) {
		ArrayList<Book> list = new ArrayList<Book>();
		for(Book b : bookList) {
			if(b.getRating() == rating)
				list.add(b);
		}
		// return list;
		return new ArrayList<>(list);
	}
	
	public ArrayList<Book> getBooksByReadStatus(boolean read) {
		ArrayList<Book> list = new ArrayList<Book>();
		for(Book b : bookList) {
			if(b.isRead() == read)
				list.add(b);
		}
		return new ArrayList<>(list);
	}
	
	//set the given book to read
	public void setToRead(Book b) {
		b.setRead(true);
	}
	
	//rate the book with the given title/author with the given rating
	public void rateBook(String title, String author, int rating) {
		for(Book b : bookList) {
			if(b.getTitle().equals(title) &&
					b.getAuthor().equals(author))
				b.setRating(rating);
		}
	}

	//get the full list of books
	public ArrayList<Book> getBookList() {
		return new ArrayList<>(bookList);
	}
	
	//suggest a random unread book to read
	public Book suggestRead() {
		Collections.shuffle(bookList);
		return new Book(bookList.get(0));
	}
	
	//remove a book from the library
	public void removeBook(Book book) {
		bookList.remove(book);
	}

	public int getNumBooks() {
		return bookList.size();
	}

	public int getNumReadBooks() {
		return getBooksByReadStatus(true).size();
	}

	public int getNumUnreadBooks() {
		return getBooksByReadStatus(false).size();
	}
}
