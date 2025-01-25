package modul2.models;

import modul2.enums.Genre;

import java.util.Arrays;

public class BookDTO {

    private String name;
    private String description;

    private int price;
    private Genre genre;


    public BookDTO(String description, Genre genre, String name, int price) {

        this.description = description;
        this.genre = genre;

        this.name = name;
        this.price = price;
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

    public void setGenre(Genre genre) {
        this.genre = genre;
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


    @Override
    public String toString() {
        return "BookDTO{" +

                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", genre=" + genre +
                '}';
    }
}
