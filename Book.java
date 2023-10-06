import java.util.ArrayList;
import java.util.List;


public class Book {
    private String author;
    private String title;
    private  String type;
    private int publicationOfYear;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPublicationOfYear() {
        return publicationOfYear;
    }

    public void setPublicationOfYear(int publicationOfYear) {
        this.publicationOfYear = publicationOfYear;
    }

    public Book(String author, String title, String type, int publicationOfYear) {
        this.author = author;
        this.title = title;
        this.type = type;
        this.publicationOfYear = publicationOfYear;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", publicationOfYear=" + publicationOfYear +
                '}';
    }
}
