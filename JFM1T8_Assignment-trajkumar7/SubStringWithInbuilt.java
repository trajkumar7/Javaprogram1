/*  JFM1T8_Assignment2:

    Write a program to find a substring in a string using an inbuilt method of String class.
    Prompt the user input from the terminal.
  
    Sample input: Learning made easy at bitLabs
    Enter search string : bitLabs
  
    Expected output: bitLabs is found
  
    Enter search string: bitlab
    Expected output: bitlab is not found
*/

import java.util.Scanner;

public class SubStringWithInbuilt {

//main method
public static void main(String[]args){
//declare variables
  String str,s;   
//take input from user
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the staring");
  str=sc.nextLine();
  System.out.println("enter search string");
  s=sc.nextLine();
  boolean result=(s.contains(str));
  if(result){    
    System.out.println(s+"is found");
  }
  else{
    System.out.println(s+"is not found");
  }

//check if the string contains substring or not if contains print found else print not found
}
}