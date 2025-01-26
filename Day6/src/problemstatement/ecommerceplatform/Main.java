package problemstatement.ecommerceplatform;

import java.util.ArrayList;

public class Main {
    public static double bill(ArrayList<Product> p){
        double result=0;
        for(Product product: p){
            result=result+product.calculateFinalPrice();

        }
        return result;
    }
    public static void main(String[] args) {
        Product electronics1=new Electronics(19217,"Laptop",98900,21);

        Product clothing1=new Clothing(64356217,676,"Kurta",24);
        Product groceries1=new Groceries(14096217,299,"Dishes",27);
        electronics1.displayDetails();
        System.out.println();
        clothing1.displayDetails();
        System.out.println();
        groceries1.displayDetails();
        System.out.println();
        ArrayList<Product> pr=new ArrayList();
        pr.add((Electronics)electronics1);
        pr.add((Clothing)clothing1);
        pr.add((Groceries)groceries1);
        System.out.println();
        System.out.println("Total bill :- "+bill(pr));

    }
}
