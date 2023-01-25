/* JFM1T5_Assignment 4:

   Write a program to create a square matrix and print its transpose.
   Prompt the user input from the terminal.
   
  Sample Input:
  Enter number of rows: 3
  Enter number of columns: 3
  Elements  [1,1] : 2
  Elements  [1,2] : 3
  Elements  [1,3] : 4
  Elements  [2,1] : 1
  Elements  [2,2] : 2
  Elements  [2,3] : 3
  Elements  [3,1] : 4
  Elements  [3,2] : 5
  Elements  [3,3] : 6
   
  Expected Output:
    
  After Transpose Matrix  
  2       1       4
  3       2       5
  4       3       6
   
*/

import java.util.Scanner;

public class TransposeMatrix {

//Define the main method
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  //Declare the variables
  int r,w;
  System.out.println("enter the rows and colums");
  r=sc.nextInt();
  w=sc.nextInt();
  System.out.println("enter the elements");
  int str[][]=new int[r][w];
  for(int i=0;i<str.length;i++){
    for(int j=0;j<str.length;j++){
      str[i][j]=sc.nextInt();
      System.out.print(" ");
    }
  }
    System.out.println(" matrix before Transpose is ");
    for(int i=0;i<str.length;i++){
    for(int j=0;j<str.length;j++){
      System.out.print(str[i][j]+" ");
    }
    System.out.println();
  }
  System.out.println("after Transpose is ");
   for(int i=0;i<str.length;i++){
    for(int j=0;j<str.length;j++){
      System.out.print(str[j][i]+" ");      
    }
    System.out.println(" ");
   }

}
//Take input from user to enter rows and column values

//Convert the square matrix into transpose

//Print the transpose matrix

//printing j and i instead of i and j

}