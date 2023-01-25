/* 
   JFM1T5_Assignment 5:
   Write a program to find and print the maximum element in a two-dimensional array with its index position.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of row and column: 
   2
   3
   Enter arr [ 0 ] [ 0] : 1
   Enter arr [ 0 ] [ 1] : 2
   Enter arr [ 0 ] [ 2] : 3

   Enter arr [ 1 ] [ 0] : 4
   Enter arr [ 1 ] [ 1] : 5
   Enter arr [ 1 ] [ 2] : 6
   
   Expected Output:
   Largest element in array is 6 and its index position is arr [ 1 ] [ 2 ]  

*/

import java.util.Scanner;

public class TwoDimentionalArray {

//Define the main method
  public static void main(String args[]){

//Declare the variables
    int r,w,max=0,x=0,y=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("the rows size  and colum size :");
    r=sc.nextInt();
    w=sc.nextInt();
    int arr[][]=new int[r][w];
    System.out.println("enter the elements :");
    
    for(int i=0;i<arr.length;i++) 
      {         
        for(int j=0;j<arr[i].length;j++)
          {
           arr[i][j]=sc.nextInt();
          }
      }
     for(int i=0;i<arr.length;i++) 
      {         
        for(int j=0;j<arr[i].length;j++)
          {
           if(arr[i][j]>max){
             max=arr[i][j];
             x=i;
             y=j;
           }
          }
      }       
        
  System.out.println (" Largest element in array is"+max+" and its index position is"+" [" + x
        + "][" + y + "] "  ); 
  }
}
//Take number of rows and columns from user in two-dimensional array

//assume first element is largest and use for loop to compare the largest element with all the reamaining elements

//Calcualte the maximum element based on index poistion

//Print result
  
