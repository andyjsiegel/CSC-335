import java.util.ArrayList;

public class BookList {
	private ArrayList<Book> books;
	
	public BookList() {
		this.books = new ArrayList<Book>();
	}
	
	public void addBook(String title, String author) {
		this.books.add(new Book(title, author));
	}
	
	public void sortByTitle() {
		for(int i = 1; i < books.size(); i++) {
			Book b = books.get(i);
			int j = i;
			while(j-1 >= 0 && b.getTitle().compareTo(books.get(j-1).getTitle()) < 0) {
				books.set(j, books.get(j-1));
				books.set(j-1, b);
				j--;
			}
		}
	}
	
	public ArrayList<Book> getBooks() {
		return new ArrayList<Book>(books);
	}
}
