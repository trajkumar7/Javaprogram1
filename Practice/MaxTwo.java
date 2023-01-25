import java.util.*;
class MaxTwo{
  public static void main(String args[]){
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a value :");
    a=sc.nextInt();
    System.out.println("enter b value :");
    b=sc.nextInt();
    if(a>b){
      System.out.println("maximu is :"+a);
    }
    else {
      System.out.println("maximu is b :"+b);
    }
  }
}