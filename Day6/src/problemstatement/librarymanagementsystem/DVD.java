package problemstatement.librarymanagementsystem;

public class DVD extends LibraryItem implements Reservable {
    private boolean isReserved;

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getTimeDuration() {
        return 3; // DVDs can be loaned for 3 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            isReserved = true;
            System.out.println("DVD reserved for " + borrowerName);
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}