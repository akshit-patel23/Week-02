package problemstatement.ecommerceplatform;

public abstract class Product {
    private int productId,price;
    private String name;


    public Product(int productId,int price,String name){
        this.price=price;
        this.productId=productId;
        this.name=name;
    }
    //getter setter

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int calculatePrice(){
        return price;
    };
    public void displayDetails(){
        System.out.println("The productId of product :- "+productId);
        System.out.println("The name of product :- "+name);
        System.out.println("The price of product :- "+price);


    }
    //Abstract method
    public abstract double calculateDiscount();

    public double calculateFinalPrice() {
        double discount = calculateDiscount();
        double tax = (this instanceof Taxable) ? ((Taxable) this).calculateTax() : 0.0;
        return price - discount + tax;
    }


}