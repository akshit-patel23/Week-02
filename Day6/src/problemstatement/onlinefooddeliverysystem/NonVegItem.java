package problemstatement.onlinefooddeliverysystem;

public class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge;
    private double discountRate;

    public NonVegItem(String itemName, double price, int quantity, double additionalCharge, double discountRate) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
        this.discountRate = discountRate;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + additionalCharge) * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * discountRate / 100;
    }

    @Override
    public void getItemDetails() {
        super.getItemDetails();
        System.out.println("Additional Charge per Unit :- " + additionalCharge);
        System.out.println("Discount :- " + applyDiscount());
        System.out.println("Final Price :- " + (calculateTotalPrice() - applyDiscount()));
    }
}