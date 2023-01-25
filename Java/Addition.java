import java.util.*;
class Addition {
  public static void main(String args[])
  {
    
    int a,b;
    		Scanner read = new Scanner(System.in); // Input stream is used

    System.out.println("enter a value");
    a=read.nextInt();
    System.out.println("enter b value");
    b=read.nextInt();
    int c=a+b;
    System.out.println("the result i: "+c);
  }
}