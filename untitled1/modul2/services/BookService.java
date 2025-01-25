package modul2.services;

import modul2.models.Book;
import modul2.models.BookDTO;

import java.util.UUID;

public interface BookService {
    void display();

    void addBook(Book book);

    void editBook(Integer id, BookDTO bookDTO);

    void deleteBook(Integer id);
}
