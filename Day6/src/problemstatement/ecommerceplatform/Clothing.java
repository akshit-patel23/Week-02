package problemstatement.ecommerceplatform;

public class Clothing extends Product implements Taxable{
    private double discountRate;

    Clothing(int productId,int price,String name,double discountRate) {
        super(productId, price, name);
        this.discountRate=discountRate;

    }
    public double calculateDiscount() {
        return getPrice() * discountRate / 100;
    }
    @Override
    public double calculateTax() {
        return getPrice() * 0.02; // 2%
    }
    public double price(){
        return (getPrice()-calculateDiscount()+calculateTax());
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Tax: " + calculateTax());
        System.out.println("The final Price of your Product is "+price());
        System.out.println("The discount rate :- "+discountRate);
        System.out.println("The discount price :- "+calculateDiscount());


    }
}