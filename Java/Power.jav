
//power.java
import java.util.*;
class Power{
  public static void main(String args[])
  {
    int base,power,res=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the base number");
    base=sc.nextInt();
    System.out.println("enter the power of a number");
    power=sc.nextInt();
    for(int i=1;i<=power;i++)
      {
        res=res*base;
        
      }
    System.out.println("the result is "+res);
  }
}