package problemstatement.librarymanagementsystem;

public class Magazine extends LibraryItem implements Reservable {
    private boolean isReserved;

    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getTimeDuration() {
        return 7; // Magazines can be loaned for 7 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Magazine reserved for " + borrowerName);
        } else {
            System.out.println("Magazine is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}