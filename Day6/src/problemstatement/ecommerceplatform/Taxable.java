package problemstatement.ecommerceplatform;

public interface Taxable {
    double calculateTax();//by default sb public he hote hai
    default void getTaxableDetails(int tax){
        System.out.println("Taxable Amount :- "+tax);// you can provide a default implementation that can be inherited by implementing classes.
    };
}