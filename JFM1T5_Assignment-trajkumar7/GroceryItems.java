/* JFM1T5_Assignment 2:

   Write a program to store your 10 different expenses done in this month and print the highest price you incurred.
   Prompt the user for the 10 numbers to be input from the terminal.
   Sample Input:
   45.90
   23.56
   123
   23
   90.00
   344
   44
   60.01
   267
   100
   
   Expected Output:

   The highest price you incurred is 344.0

*/

import java.util.Scanner;

public class GroceryItems {

//Define the main method
  public static void main(String args[]){

//Declare and initialize variables
   int n;
  double max;
//Take the 10 different expenses price
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no of items:");
    n=sc.nextInt();
    double a[] = new double[n];
    System.out.println("enter the price items:");
//Check the 10 different expenses price using for loop
   for(int i=0;i<a.length;i++){
     a[i]=sc.nextDouble();
   }
    max=a[0];
    for(int i=0; i<a.length;i++){
      if(a[i]>max){
        max=a[i];
      }
    }
     System.out.println("the max value is"+max);
  }
//Calculate the highest price in all expenses and check if the expenses is more than new item. If true then return max.

//Print the result

}
