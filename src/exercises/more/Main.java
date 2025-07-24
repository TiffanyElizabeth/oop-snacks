package exercises.more;

public class Main {
    public static void main(String[] args) {
        Prodotto test = new Prodotto("test", 100, 5);
        System.out.println(test);

        test.sale(4);
        System.out.println(test);

        test.sale(4);
        System.out.println(test);

        Libreria testBookshop = new Libreria();
        System.out.println(testBookshop);
    }
}
