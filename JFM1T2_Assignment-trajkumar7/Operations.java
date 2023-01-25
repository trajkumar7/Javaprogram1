/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)//-
     2. Product of 2 numbers (45 and 2)//*
     3. Division of 2 numbers (600 and 10)// /
     4. Increment and Decrement the number (15)//--  ++
     5. Remainder of 2 numbers (14 and 5)//
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Operations {

    // main meth
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first numbser: ");
    int num1 = sc.nextInt();
    System.out.println("Enter second number: ");
    int num2 = sc.nextInt();

    System.out.println("difference of 2 numbers is: " + (num1 - num2));
    System.out.println("Enter first numbser: ");
    int num3 = sc.nextInt();
    System.out.println("Enter second number: ");
    int num4 = sc.nextInt();
    System.out.println("produt of 2 numbers is:" + (num3 * num4));
    System.out.println("Enter first numbser: ");
    int num5 = sc.nextInt();
    System.out.println("Enter second number: ");
    int num6 = sc.nextInt();
    System.out.println("division of 2 numbers is:" + (num5 / num6));
    System.out.println("Enter first numbser: ");
    int num7 = sc.nextInt();
    System.out.println("Enter second number: ");
    int num8 = sc.nextInt();
    System.out.println("reminder of 2 numbers is:" + (num7 % num8));
    System.out.println("Enter first numbser: ");
    int num9 = sc.nextInt();
    System.out.println("Enter second number: ");
    int num10 = sc.nextInt();
    System.out.println("Increment and Decrement the number is" + (num9++ + num10--));

    /*
     * Use the scanner class to provide input at execution time using scanner object
     * Scanner sc=new Scanner(System.in);
     */

    /*
     * Take input from user System.out.println("Enter first number: "); int
     * a=sc.nextInt();
     */

    // calculate difference,product,division,increment and remainder

    // print appropriate result for all operations

  }
}
