/*  JFM1T2_Assignment6:

    Write a program that swaps the values of 2 variables without using third variable.
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    12
    Enter second number: 
    45
    
    Expected Output:
    Before swapping: 12 , 45
    After swapping: 45 , 12
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Swapping {
  public static void main(String args[]){

//main method
int x,y;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter  first number");
  x=sc.nextInt();
System.out.println("Enter second value");
y=sc.nextInt();
System.out.println("Before swapping:"+x+ "," +y);
x=x+y;//57
y=x-y;//12
x=x-y;//45
System.out.println("After swapping:"+x+ "," +y);

  
  
/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*
  Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/

//swapping two numbers without using third variable

//print result
  }
}