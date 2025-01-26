package problemstatement.onlinefooddeliverysystem;

public class VegItem extends FoodItem implements Discountable {
    private double discountRate;

    public VegItem(String itemName, double price, int quantity, double discountRate) {
        super(itemName, price, quantity);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * discountRate / 100;
    }

    @Override
    public void getItemDetails() {
        super.getItemDetails();
        System.out.println("Discount :- " + applyDiscount());
        System.out.println("Final Price :- " + (calculateTotalPrice() - applyDiscount()));
    }
}