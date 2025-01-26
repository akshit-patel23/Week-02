package problemstatement.librarymanagementsystem;

public class Book extends LibraryItem implements Reservable {
    private boolean isReserved;

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getTimeDuration() {
        return 14; // Books can be loaned for 14 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Book reserved for " + borrowerName);
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}