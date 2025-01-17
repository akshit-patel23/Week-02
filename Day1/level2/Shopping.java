import java.util.Scanner;

class ShoppingCart {
    private int numOfItem;
    private int index = 0;
    private String[] items;

    // Constructor
    ShoppingCart(int numOfItem) {
        this.numOfItem = numOfItem;
        items = new String[numOfItem];
    }

    // Method for add item
    void addItem(String itemName) {
        if (index < numOfItem) {
            items[index++] = itemName;
            System.out.println("Item added: " + itemName);
        } else {
            System.out.println("Cart is full! Cannot add more items.");
        }
    }

    // Method to remove last item
    void remove() {
        if (index > 0) {
            System.out.println("Item removed: " + items[--index]);
        } else {
            System.out.println("No items to remove!");
        }
    }

    // Method to display items
    void display() {
        if (index == 0) {
            System.out.println("Cart is empty!");
        } else {
            System.out.println("List of Items in Cart:");
            for (int i = 0; i < index; i++) {
                System.out.println((i + 1) + ". " + items[i]);
            }
        }
    }
}

public class Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input 
        System.out.print("Enter the number of items in the cart: ");
        int numItems = sc.nextInt();
        sc.nextLine(); 

        ShoppingCart shop = new ShoppingCart(numItems);

        // Adding in cart
        for (int i = 0; i < numItems; i++) {
            System.out.print("Enter the name of item " + (i + 1) + ": ");
            String itemName = sc.nextLine();
            shop.addItem(itemName);
        }

        // Menu for operations
        System.out.print("Press 'R' to remove items or 'D' to display items: ");
        String op = sc.nextLine().toUpperCase();

        switch (op) {
			case "r":
            case "R":
                System.out.print("Enter the number of items to remove: ");
                int removeCount = sc.nextInt();
                for (int i = 0; i < removeCount; i++) {
                    shop.remove();
                }
                shop.display();
                break;
			case "d":
            case "D":
                shop.display();
                break;
            default:
                System.out.println("Invalid operation. Please try again.");
                break;
        }

       
    }
}