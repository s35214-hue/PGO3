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

    }

    public void printInfo() {

        System.out.println(title);
        System.out.println(author);
        System.out.println(pageCount);
        System.out.println(available);

    }

    public void borrow() {

        if (available) {
            System.out.println("Successfully borrowed: " + title);
            available = false;
        } else {
            System.out.println("The book you are trying to borrow is currently unavailable.");
        }

    } public void returnBook() {
        if(!(available)) {
            System.out.println("Book successfully returned!");
            available = true;

        } else {
            System.out.println("This book has already been returned.");
        }
    }
}








