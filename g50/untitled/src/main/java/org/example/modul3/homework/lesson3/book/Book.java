package untitled.src.main.java.org.example.modul3.homework.lesson3.book;

public class Book {
    private String name;
    private BookGenreEnum bookGenreEnum;
    private double price;

    public Book(String name, BookGenreEnum bookGenreEnum, double price) {
        this.bookGenreEnum = bookGenreEnum;
        this.name = name;
        this.price = price;
    }

    public BookGenreEnum getBookGenreEnum() {
        return bookGenreEnum;
    }

    public void setBookGenreEnum(BookGenreEnum bookGenreEnum) {
        this.bookGenreEnum = bookGenreEnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookGenreEnum=" + bookGenreEnum +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
