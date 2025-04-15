import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("T1", "A1");
        Book b2 = new Novel("T2", "A2", "G2");
        Novel b3 = new Novel("T3", "A3", "G3");
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
