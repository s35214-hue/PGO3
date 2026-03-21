import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int pageCount;
    private boolean available;

    public Book(String title, String author, int pageCount, boolean available) {

        this.title = title.toUpperCase();
        this.author = author.toUpperCase();
        this.pageCount = pageCount;
        this.available = available;

    } public String getTitle() {

        return title;

    } public String getAuthor() {

        return author;

    } public int getPageCount() {

        return pageCount;

    } public boolean getAvailable() {

        return available;

    } public void setTitle(String title) {

        this.title = title;

    } public void setAuthor(String author) {

        this.author = author;

    } public void setPageCount(int pageCount) {

        this.pageCount = pageCount;

    } public void setAvailable(boolean available) {

        this.available = available;

    }

    public void printInfo() {

        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
        System.out.println("Is available?: " + available);

    }

    public void borrow() {

        if (available) {
            System.out.println("Successfully borrowed: " + title);
            available = false;
        } else {
            System.out.println("The book you are trying to borrow is currently unavailable.");
        }

    }

    public void returnBook() {
        if (!(available)) {
            System.out.println("Book successfully returned!");
            available = true;

        } else {
            System.out.println("This book has already been returned.");
        }

    }
}







