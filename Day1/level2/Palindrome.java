import java.util.*;

class PalindromeChecker{

private String text;

PalindromeChecker(String text){
this.text=text;
}

public void checker(){
int i=0;
int j=text.length()-1;
boolean f=true;
while(i<=j){
if(text.charAt(i)!=text.charAt(j)){
System.out.println(text+ " String is not palindrome");
f=false;
break;
}
i++;
j--;
}
if(f==true)System.out.println(text+ " String is palindrome");

}


}

public class Palindrome{

public static void main(String args[]){

System.out.println("Enter the text: ");
Scanner sc=new Scanner(System.in);

String text=sc.nextLine();

PalindromeChecker obj=new PalindromeChecker(text);
obj.checker();


}


}