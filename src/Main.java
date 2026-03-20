public class Main {
    public static void main (String[] args) {

        Book book1 = new Book("t1", "a1", 100, true );

        Book book2 = new Book("t2", "a2", 150, false);

        Book book3 = new Book("t3","a3",80, false);

        book1.printInfo();
        book2.borrow();
        book3.returnBook();

        Reader reader1 = new Reader("Kowalski","Jan",1000100010, 1);
        Reader reader2 = new Reader("Doe","Jane",1000100010, 1);

        reader1.printData();
        reader2.increaseBorrowedCount(1);
        reader2.decreaseBorrowedCount(1);


    }
}
