public class Reader {

    private String lastName;
    private String firstName;
    private long cardNumber;
    private int borrowedCount;

    public Reader(String lastName, String firstName, long cardNumber, int borrowedCount) {

        this.lastName = lastName;
        this.firstName = firstName;
        this.cardNumber = cardNumber;
        this.borrowedCount = borrowedCount;

    } public void printData() {

        System.out.println("Last name: " + lastName);
        System.out.println("First name: " + firstName);
        System.out.println("Card number: " + cardNumber);
        System.out.println("Borrowed count: " + borrowedCount);

    } public int increaseBorrowedCount(int amount) {

        return borrowedCount = borrowedCount + amount;

    } public int decreaseBorrowedCount(int amount) {

        return borrowedCount = borrowedCount - amount;

    }
}
