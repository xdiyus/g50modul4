package modul2.models;

import modul2.enums.Genre;
import modul2.services.BookService;

import java.util.Arrays;
import java.util.UUID;

public class Book {
    private Integer id;
    private String name;
    private String description;
    private int price;
    private Genre genre;
    Author[] authors;

    public Book(String description, Genre genre, String name, int price) {

        this.description = description;
        this.genre = genre;

        this.name = name;
        this.price = price;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Genre getGenre() {
        return genre;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static BookBuilder builder() {
        return new BookBuilder();
    }


    public static class BookBuilder {

        private String name;
        private String description;
        private int price;
        private Genre genre;


        public BookBuilder description(String description) {
            this.description = description;
            return this;
        }

        public BookBuilder genre(Genre genre) {
            this.genre = genre;
            return this;
        }

        public BookBuilder name(String name) {
            this.name = name;
            return this;
        }

        public BookBuilder price(int price) {
            this.price = price;
            return this;
        }

        public Book build() {
            return new Book(

                    description,
                    genre,
                    name,
                    price


            );
        }
    }


    @Override
    public String toString() {
        return "Book{" +
                "authors=" + Arrays.toString(authors) +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", genre=" + genre +
                '}';
    }
}
