package untitled.src.main.java.org.example.modul3.homework.lesson3.book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookServiceImpl implements BookService {

    private List<Book> books;

    public BookServiceImpl(List<Book> books) {
        this.books = books;
    }

    @Override
    public void price() {
        for (Book book : books) {
            if (book.getBookGenreEnum().equals(BookGenreEnum.DETECTIVE)) {
                book.setPrice(book.getPrice() + 5000);
            }
        }
    }

    @Override
    public List<Book> newBooks() {
        List<Book> books1 = new ArrayList<>();
        for (int i = 2; i <= 13; i++) {
            books1.add(books.get(i));
        }

        books = books1;
        return books;
    }

    @Override
    public void removeBooks() {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getPrice() > 100000) {
                iterator.remove();
            }
        }
    }

    @Override
    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
