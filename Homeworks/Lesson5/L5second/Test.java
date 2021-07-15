package Homeworks.Lesson5.L5second;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner((System.in));
        Author author = new Author();
        System.out.println("Enter Author name");
        author.setName(s.next());
        System.out.println("Enter  count of books");
        int count = s.nextInt();

        Book[] books = new Book[count];
        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter name for book " + (i + 1));
            String name = s.next();
            System.out.println(" Enter count of pages for book " + (i + 1));
            int countOfPages = s.nextInt();
            books[i] = new Book(name, countOfPages);

        }
        author.setBooks(books);
        AuthorService service = new AuthorService();
        System.out.println("---------------------------");
        service.printBookNameHavingMaxPages(author);

    }
}

