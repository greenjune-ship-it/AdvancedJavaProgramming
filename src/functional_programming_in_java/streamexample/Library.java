package functional_programming_in_java.streamexample;

import java.util.ArrayList;

public class Library {

    public static void main(String[] args) {

        ArrayList<Book> books = populateLibrary();

        books.stream().filter(book ->  {
            return book.getAuthor().startsWith("J");
        }).filter(book ->  {
            return book.getTitle().startsWith("E");
        }).forEach(System.out::println);
    }

    static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList();
        books.add(new Book("Jonh Steinbeck", "East of Eden"));
        books.add(new Book("Jonh Steinbeck", "The Grapes of Wrath"));
        books.add(new Book("Toni Morrison", "Paradise"));
        return books;
    }

}
