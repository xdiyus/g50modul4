package untitled.src.main.java.org.example.modul3.homework.lesson3.book;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {



    List<Book> books = new ArrayList<>();

        books.add(new Book("Kitob 1", BookGenreEnum.DETECTIVE, 25000));
        books.add(new Book("Kitob 2", BookGenreEnum.ROMANCE, 15000));
        books.add(new Book("Kitob 3", BookGenreEnum.DETECTIVE, 300000));
        books.add(new Book("Kitob 4", BookGenreEnum.MYSTERY, 12000));
        books.add(new Book("Kitob 5", BookGenreEnum.SCIENCE_FICTION, 20000));
        books.add(new Book("Kitob 6", BookGenreEnum.DETECTIVE, 10000));
        books.add(new Book("Kitob 7", BookGenreEnum.ROMANCE, 5000));
        books.add(new Book("Kitob 8", BookGenreEnum.DETECTIVE, 700000));
        books.add(new Book("Kitob 9", BookGenreEnum.FANTASY, 30000));
        books.add(new Book("Kitob 10", BookGenreEnum.THRILLER, 45000));
        books.add(new Book("Kitob 11", BookGenreEnum.DETECTIVE, 250000));
        books.add(new Book("Kitob 12", BookGenreEnum.MYSTERY, 35000));
        books.add(new Book("Kitob 13", BookGenreEnum.DETECTIVE, 55000));
        books.add(new Book("Kitob 14", BookGenreEnum.SCIENCE_FICTION, 250000));
        books.add(new Book("Kitob 15", BookGenreEnum.FANTASY, 45000));
        books.add(new Book("Kitob 16", BookGenreEnum.THRILLER, 100000));
        books.add(new Book("Kitob 17", BookGenreEnum.ROMANCE, 8000));
        books.add(new Book("Kitob 18", BookGenreEnum.DETECTIVE, 20000));
        books.add(new Book("Kitob 19", BookGenreEnum.SCIENCE_FICTION, 15000));
        books.add(new Book("Kitob 20", BookGenreEnum.MYSTERY, 30000));


    BookService bookService = new BookServiceImpl(books);

    bookService.printBooks();
        System.out.println("Yangi kitoblar listi 3 dan 14 gacha");
    bookService.newBooks();
    bookService.printBooks();
        System.out.println("5000 ga oshti");
    bookService.price();
        bookService.printBooks();
        System.out.println("100 ming so'mdan oshig kitoblar o'chirildi");
        bookService.removeBooks();
        bookService.printBooks();
}
}
