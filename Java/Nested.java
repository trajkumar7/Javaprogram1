import java.util.*;
class Nested{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number:");
    int a=sc.nextInt();
    if (a%5==0||a%11==0)
    {
  
      System.out.println("the given number divisible by number ");
    }
    else {
      System.out.println("the number is not divisible by number");
    }
  }
  
}