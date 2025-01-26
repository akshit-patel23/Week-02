package problemstatement.onlinefooddeliverysystem;

public interface Discountable {
    double applyDiscount();

    default void getDiscountDetails() {
        System.out.println("Discount applied as per the policy.");
    }
}