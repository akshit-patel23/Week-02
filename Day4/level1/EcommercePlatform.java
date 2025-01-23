package level1;
import java.util.ArrayList;
import java.util.List;

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private int id;
    private Customer customer;
    private List<Product> products;

    public Order(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }
}

class Customer {
    private int id;
    private String name;
    private String email;
    private List<Order> orders;

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Order> getOrders() {
        return orders;
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "John Doe", "john.doe@example.com");

        Order order1 = new Order(1, customer);
        Order order2 = new Order(2, customer);

        Product product1 = new Product(101, "Laptop", 899.99);
        Product product2 = new Product(102, "Mouse", 25.50);
        order1.addProduct(product1);
        order1.addProduct(product2);

        Product product3 = new Product(103, "Keyboard", 49.99);
        Product product4 = new Product(104, "Headphones", 79.99);
        order2.addProduct(product3);
        order2.addProduct(product4);

        customer.placeOrder(order1);
        customer.placeOrder(order2);

        System.out.println("\nCustomer Details:");
        System.out.println("Customer ID: " + customer.getId());
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Email: " + customer.getEmail());
        System.out.println("Total Orders: " + customer.getOrders().size());

        System.out.println("\nOrder Details:");
        for (Order order : customer.getOrders()) {
            System.out.println("\nOrder ID: " + order.getId());
            System.out.println("Order for Customer: " + order.getCustomer().getName());
            System.out.println("Products in Order:");
            for (Product product : order.getProducts()) {
                System.out.println("  - Product ID: " + product.getId() +
                                   ", Name: " + product.getName() +
                                   ", Price: " + product.getPrice());
            }
            System.out.println("Total Price: " + order.calculateTotalPrice());
        }
    }
}
