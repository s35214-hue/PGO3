public class Reader {

    private String lastName;
    private String firstName;
    private long cardNumber;
    private int borrowedCount;

    public Reader(String lastName, String firstName, long cardNumber, int borrowedCount) {

        this.lastName = lastName.toUpperCase();
        this.firstName = firstName.toUpperCase();
        this.cardNumber = cardNumber;
        this.borrowedCount = borrowedCount;

    } public void  setLastName(String lastName) {

        this.lastName = lastName;

    } public void setFirstName(String firstName) {

        this.firstName = firstName;

    } public  void setCardNumber(long cardNumber) {

        this.cardNumber = cardNumber;

    } public void setBorrowedCount(int borrowedCount) {

        this.borrowedCount = borrowedCount;

    } public String getLastName() {

        return lastName;

    } public String getFirstName() {

        return firstName;

    } public long getCardNumber() {

        return cardNumber;

    } public int getBorrowedCount() {

        return borrowedCount;

    } public void printData() {

        System.out.println("Last name: " + lastName);
        System.out.println("First name: " + firstName);
        System.out.println("Card number: " + cardNumber);
        System.out.println("Borrowed count: " + borrowedCount);

    } public void increaseBorrowedCount(int amount) {

        borrowedCount = borrowedCount + amount;

    } public void decreaseBorrowedCount(int amount) {

        borrowedCount = borrowedCount - amount;

    }
}
