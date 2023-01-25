/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/


import java.util.Scanner;

public class Temperature{

//Define the main method
  public static void main(String args[]){

//Declare the variables and initialize
    int n;double min;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number of days");
      n=sc.nextInt();
      int arr[]=new int[n];
      
      for(int i=0;i<arr.length;i++)
        {
          System.out.println("Enter the temperature of Day : "+(i+1));
          arr[i]=sc.nextInt();
        }
      min=arr[0];
      for(int i=1;i<arr.length;i++)
        {
          if(arr[i]<min)
          {
             min=arr[i];
          }
        }
      System.out.println("The lowest temperature of the week "+n+" is "+min+"  celsius ");
  }  
//Take temperature of 7 days as a input from user

//Calculate the lowest temperature

//Print the result

}
