import java.util.Arrays;
import java.util.Scanner;

public class Library {

    private int bookCount;
    private final Book[] books;

    private final static int MAX_BOOK_COUNT = 20;

    public Library(int capacity) {

        if (capacity < MAX_BOOK_COUNT) {

            bookCount = capacity;
            books = new Book[bookCount];

        } else {

            throw new IllegalArgumentException("Library capacity exceeded. The maximum allowed value is " + MAX_BOOK_COUNT + ".");

        }


    } public void addBook(Book book) {

        for (int i = 0; i < bookCount; i++) {

            if(books[i] == null) {

                books[i] = book;
                break;

            }

        }

    } public void printAvailableBooks() {

        System.out.println("Available Books: ");

        for (int i = 0; i < bookCount; i++) {

            if(!(books[i] == null)) {

                if (books[i].getAvailable()) {

                    System.out.println(books[i].getTitle());

                }

            }

        }

    } public void findBookByTitle(String title) {

        for (int i = 0; i < bookCount; i++) {

            if (!(books[i] == null)) {

                if (books[i].getTitle().equals(title)) {

                    System.out.println("Found match:");
                    books[i].printInfo();

                }

            }

        }

    } public void findBookByAuthor(String author) {

        for (int i = 0; i < bookCount; i++) {

            if (!(books[i] == null)) {

                if (books[i].getAuthor().equals(author.toUpperCase())) {

                    System.out.println("Found match:");
                    books[i].printInfo();

                }

            }

        }

    }

    public void countAvailableBooks() {


        int counter = 0;

        for (int i = 0; i < bookCount; i++) {

            if(!(books[i] == null)) {

                if (books[i].getAvailable()) {

                    counter++;

                }

            }

        } System.out.println("The number of available books is: " + counter);

    } public void borrowBook(String title, Reader reader) {

        for (int i = 0; i < bookCount; i++) {

            if(!(books[i] == null)) {

                if (books[i].getTitle().equals(title.toUpperCase())) {

                    System.out.println("Title successfully borrowed: " + books[i].getTitle());

                    books[i].setAvailable(false);
                    reader.increaseBorrowedCount(1);
                    break;

                }

            }

        }

    } public void returnBook(String title, Reader reader) {

        for (int i = 0; i < bookCount; i++) {

            if(!(books[i] == null)) {

                if (books[i].getTitle().equals(title.toUpperCase())) {

                    System.out.println("Title successfully returned: " + books[i].getTitle());
                    books[i].setAvailable(true);
                    reader.decreaseBorrowedCount(1);
                    break;

                }

            }

        }

    }

}
