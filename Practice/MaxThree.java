import java.util.*;
class MaxThree{
  public static void main(String args[]){
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a value :");
    a=sc.nextInt();
    System.out.println("enter b value :");
    b=sc.nextInt();
    System.out.println("enter c value :");
    c=sc.nextInt();
    if(a>b && a>c){
      System.out.println("maximu is :"+a);
    }
      else if(b>c){
         System.out.println("maximu is :"+b);
      }
    else {
      System.out.println("maximu is  :"+c);
    }
  }
}