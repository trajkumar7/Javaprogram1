/* JFM1T6_Assignment3:

   Write a method that takes any numbers as arguments/parameters and return the mean value back to main method.
   Prompt the user for the  values to be input from the terminal.

   Sample input:
   num1 = 3
   num2 = 2
   num3 = 4

   Expected Output:
   result = 3
   
*/

import java.util.Scanner;

public class Mean {

//main method
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
      int sum=0;
        System.out.print("Input the first number: ");
        int x = in.nextInt();
        System.out.print("Input the second number: ");
        int y = in.nextInt();
        System.out.print("Input the third number: ");
        int z = in.nextInt();
        System.out.print("The Mean value is " + mean(x, y, z)+"\n" );
    }
   public static int mean(int x, int y, int z)
    {
        return (x + y + z) / 3;
    }
//declare variables and initialize sum=0

//create scanner object

//take input from user

//check the for loop for number of values entered in input

//calculate mean

//print result

}