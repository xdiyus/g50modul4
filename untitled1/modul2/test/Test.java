package modul2.test;

import modul2.enums.Genre;
import modul2.models.Author;
import modul2.models.Book;
import modul2.models.BookDTO;
import modul2.services.BookService;
import modul2.services.BookServiceImpl;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Book[] book = new Book[10];


        BookService bookService = new BookServiceImpl();

        Book book1 = Book.builder().description("Made in Italy").price(200).genre(Genre.HISTORY).name("Pink rose").build();
        bookService.addBook(book1);

        Book book2 = Book.builder().description("Made in USA").price(500).genre(Genre.FANTASY).name("Black gun").build();
        bookService.addBook(book2);
        bookService.display();

        BookDTO bookDTO = new BookDTO("Made in Korea", Genre.FANTASY, "Korea history", 500);

        Scanner scanner = new Scanner(System.in);
        Integer id = book1.getId();
        System.out.println("Ozgartirish kere bogan id kiriting: ");
        int bookID = scanner.nextInt();
        bookService.editBook(bookID, bookDTO);


        System.out.println("Ochirish kere bogan id kiriting: ");
        int deleteID = scanner.nextInt();
        bookService.deleteBook(deleteID);
        bookService.display();


    }
}
