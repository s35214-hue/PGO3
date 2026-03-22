public class Main {
    public static void main (String[] args) {

        Library library = new Library(19);
        Reader reader1 = new Reader("Doe", "Jane", 1001110000, 0);



        Book book1 = new Book("t1", "a1", 100, true );

        library.addBook(book1);

        Book book2 = new Book("t2", "a2", 150, true);

        library.addBook(book2);

        Book book3 = new Book("t3","a3",80, true);

        library.addBook(book3);

        library.printAvailableBooks();

        library.borrowBook("t2", reader1);

        library.printAvailableBooks();

        library.returnBook("t2", reader1);

        library.printAvailableBooks();

    }

}
