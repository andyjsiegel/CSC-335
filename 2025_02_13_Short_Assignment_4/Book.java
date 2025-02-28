public class Book {
	/* INSTANCE VARIABLES */
	private String title;
	private String author;
	private int rating;
	private boolean read;
	
	/* CONSTRUCTORS */
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.rating = 0;
		this.read = false;
	}

	public Book(Book book) {
		this.title = book.getTitle();
		this.author = book.getAuthor();
		this.rating = book.getRating();
		this.read = book.isRead();
	}
	
	/* METHODS */
	
	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}
	
	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
}
