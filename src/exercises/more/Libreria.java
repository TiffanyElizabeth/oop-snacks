package exercises.more;

public class Libreria {
    Libro[] bookshop;
    private int currentSize = 0;

    public Libreria() {
        bookshop = new Libro[1000];
    }

    public void addBook(Libro newLibro) {
        bookshop[currentSize] = newLibro;
        currentSize++;
    }

    public void showCatalogue() {
        for (int i = 0; i < bookshop.length; i++) {
            if (bookshop[i] != null) {
                System.out.println(bookshop[i]);
            }
        }
    }

    public void searchByTitle(String titleQuery) {

        for (int i = 0; i < bookshop.length; i++) {
            Libro current = bookshop[i];
            if (current.getBookTitle().equalsIgnoreCase(titleQuery)) {
                System.out.println(current);
                break;
            }
        }
    }

    public Libro[] getBookshop() {
        return this.bookshop;
    }

    public void setBookshop(Libro[] bookshop) {
        this.bookshop = bookshop;
    }

    public int getCurrentSize() {
        return this.currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    @Override
    public String toString() {
        return "{" +
                " bookshop='" + getBookshop() + "'" +
                ", currentSize='" + getCurrentSize() + "'" +
                "}";
    }

}
