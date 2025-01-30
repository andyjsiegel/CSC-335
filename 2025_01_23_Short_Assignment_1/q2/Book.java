public class Book {
    public final String TITLE;
    public final String AUTHOR;
    public int rating;

    public Book(String title, String author) {
        this.TITLE = title;
        this.AUTHOR = author;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return this.rating;
    }
}
