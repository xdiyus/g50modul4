package modul2.services;

import modul2.models.Book;
import modul2.models.BookDTO;

import java.util.Objects;


public class BookServiceImpl implements BookService {

    Book[] books = new Book[10];

    @Override
    public void display() {
        for (Book book : books) {
            if (Objects.nonNull(book)) {
                System.out.println(book);
            }
        }
    }

    @Override
    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (Objects.isNull(books[i])) {
                book.setId(i + 1);
                books[i] = book;
                System.out.println("Book added");
                return;
            }
        }

        System.out.println("Not found book");
    }


    @Override
    public void editBook(Integer id, BookDTO bookDTO) {

        for (Book book : books) {
            if (Objects.nonNull(book) && Objects.equals(book.getId(), id)) {
                book.setDescription(book.getDescription());
                book.setPrice(bookDTO.getPrice());
                book.setName(bookDTO.getName());
                System.out.println("book updated");
                return;
            }
        }
        System.out.println("Book not found!");
    }


    @Override
    public void deleteBook(Integer id) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && Objects.equals(books[i].getId(), id)) {
                books[i] = null;
                for (int j = i; j < books.length - 1; j++) { ///Mawita j iwlamayapti nimagadur wunga almawmayapti yangi kitobga
                    books[j] = books[j + 1];
                    System.out.println("Book deleted");

                }
            }
        }
        System.out.println("Book not deleted!");
    }
}