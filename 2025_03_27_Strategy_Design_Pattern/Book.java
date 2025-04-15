import java.util.Comparator;

public class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
	
	@Override
	public String toString() {
		return this.title + " by " + this.author;
	}
	
	public static Comparator<Book> titleFirstComparator() {
		return new Comparator<Book>() {
			public int compare(Book book1, Book book2) {
				int comp = book1.title.compareTo(book2.title);
				if(comp == 0)
					comp = book1.author.compareTo(book2.author);
				return comp;
			}
		};
	}
	
	public static Comparator<Book> authorFirstComparator() {
		return new Comparator<Book>() {
			public int compare(Book book1, Book book2) {
				int comp = book1.author.compareTo(book2.author);
				if(comp == 0)
					comp = book1.title.compareTo(book2.title);
				return comp;
			}
		};
	}
}
