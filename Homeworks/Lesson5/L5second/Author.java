package Homeworks.Lesson5.L5second;

public class Author {
    private String name;
    private Book[] books;

    public Author(String name, Book[] books) {
        this.name = name;
        this.books = books;
    }

    public Author() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
