package Homeworks.Lesson5.L5second;

public class AuthorService {
    public void printBookNameHavingMaxPages(Author author) {
        Book[] books = author.getBooks();
        Book max = books[0];
        for (int i = 1; i < books.length; i++) {
            if (max.getPageCount() < books[i].getPageCount()) {
                max = books[i];
            }
            System.out.println(max.getName());


        }

    }


}
