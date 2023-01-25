import java.util.*;
class Char{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the Char:");
    char ch=sc.next().charAt(0);
    if ((ch='A'&& ch='Z')||(ch='a'&&ch='z'))
    {
  
      System.out.println("the char is alphabet:");
    }
    else {
      System.out.println("the the char is not alphabet:");
    }
  }
  
}