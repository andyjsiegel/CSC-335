public class Main {
	public static void main(String[] args) {
		Book book = new Book(args[0], args[1]);
		book.setRating(0);
		//System.out.println(book.getTitle()); // error caused by no getTitle method in Book class
		//book.setRating(args[3]); // error caused by incorrect parameter type, setRating takes an int
	}
}
