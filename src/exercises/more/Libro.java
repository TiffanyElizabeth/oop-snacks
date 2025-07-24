package exercises.more;

public class Libro {
    private String bookTitle;
    private String bookAuthor;
    private short publicationYear;

    public Libro(String bookTitle, String bookAuthor, short publicationYear) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.publicationYear = publicationYear;

    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return this.bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public short getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(short publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "{" +
                " bookTitle='" + getBookTitle() + "'" +
                ", bookAuthor='" + getBookAuthor() + "'" +
                ", publicationYear='" + getPublicationYear() + "'" +
                "}";
    }

}
