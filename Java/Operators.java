/*class Operators{
  public static void main(String args[]){
    byte a=10;
    long c=a;
    //add
    //System.out.println("a+bis:"+(a+b));
    //mult
    //System.out.println("a*b is:"+(a*b));
    //sub
    //System.out.println("a-b is"+(a-b));
    //Div
    System.out.println("a/b is:" +c);
    //per
    //System.out.println("a%b is"+(a%b));
  }
}*/
import java.util.Scanner;

public class Operators {

//main meth
  Scanner sc=new Scanner(System.in);
  int num1,num2;
  System.out.println("Enter first numbser: ");
  first num1=sc.nextInt();
  System.out.println("Enter second number: ");
  second num2=sc.nextInt();
  System.out.println("difference of 2 numbers is: "+(num1-num2));
  System.out.println("produt of 2 numbers is:"+(num1*num2));
  System.out.println("division of 2 numbers is:"+(num1/num2));
  System.out.println("reminder of 2 numbers is:"+(num1%num2));

}
