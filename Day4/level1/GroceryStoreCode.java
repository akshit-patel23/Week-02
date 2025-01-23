package level1;
import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double quantity;
    private double pricePerUnit;

    public Product(String name, double quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public double getTotalPrice() {
        return quantity * pricePerUnit;
    }
}

// Customer class representing a customer making purchases
class Customer {
    private String name;
    private List<Product> cart;

    public Customer(String name) {
        this.name = name;
        this.cart = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addProduct(Product product) {
        cart.add(product);
    }

    public List<Product> getCart() {
        return cart;
    }
}


class BillGenerator {

    public static double generateBill(Customer customer) {
        double totalAmount = 0.0;
        for (Product product : customer.getCart()) {
            totalAmount += product.getTotalPrice();
        }
        return totalAmount;
    }
}


public class GroceryStoreCode {

    public static void main(String[] args) {
        // Create products
        Product apples = new Product("Apples", 2, 3);  // 2 kg at rs3 per kg
        Product milk = new Product("Milk", 1, 2);  // 1 liter at rs2 per liter

        // Create customer
        Customer alice = new Customer("Dev");
        alice.addProduct(apples);
        alice.addProduct(milk);

        // Generate the bill
        double totalAmount = BillGenerator.generateBill(alice);

        // Print the receipt
        System.out.println("Customer: " + alice.getName());
        System.out.println("Purchased Products:");
        for (Product product : alice.getCart()) {
            System.out.println(product.getName() + ": " + product.getQuantity() +
                    " units at " + product.getPricePerUnit() + " per unit");
        }
        System.out.println("Total Amount: " + totalAmount);
    }
}
