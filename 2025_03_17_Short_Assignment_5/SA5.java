public class SA5 {
    public static void main(String[] args) {
        addThree(1, 2, 3);
        addThree(1.1, 2.1, 3.1);
        addThree(1, 2.2, 3.3);
        addThree(1.1, 2, 3.3);
        addThree(1, 2.2, 3.3);

        int a = 1;
        int b = 2;
        double c = 3.3;
        double d = 4.45;
        String s = "apple";
        String t = "banana";
        Book b1 = new Book("It", "Stephen King");
        Book b2 = new Book("Ulysses", "James Joyce");

        System.out.println(a + c + s); // "4.3apple"
        System.out.println((double) a + b / 2); //a casted to double, b divided by 2, double + int = double -> 2.0
        System.out.println((double) ((a + b) / 2)); //a + b divided by 2, division of an int returns an int (3/2 = 1), casted to double -> 1.0
        System.out.println(s + a + d + t); //apple14.45banana
        System.out.println(s + (a + d) + t); //apple5.45banana
        System.out.println(b1); //It by Stephen King
        System.out.println(b2.getTitle()); //Ulysses
    }

    public static double addThree(int a, int b, int c) {
        return a + b + c;
    }

    public static double addThree(double a, double b, double c) {
        return (a + b + c);
    }

    // public static double addThree(int a, double b, double c) {
    //     return (a + b + c);
    // }

    // public static double addThree(double a, int b, double c) {
    //     return (a + b + c);
    // }


}
