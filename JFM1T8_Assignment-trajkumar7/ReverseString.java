/*  JFM1T8_Assignment5:

    Write a program to reverse a string using StringBuffer. Reverse entire sentence in string and also reverse each word in the string. 
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    
    Expected output:
    reversing entire string: sbaLtib ta ysae edam gninraeL
    reversing each word at its place: gninraeL edam ysae ta sbaLtib  
*/

import java.util.Scanner;

public class ReverseString {

//main method
public static void main(String args[]){
//declare variables and take input from user
Scanner sc=new Scanner(System.in);
  System.out.println("enter the string");
  String s=sc.nextLine();String a;
   String str="";
  StringBuffer sb=new StringBuffer();
//creat stringbuffer object for string reversing
     for(int i=s.length()-1;i>=0;i--)
        {
          str=str+s.charAt(i);        
        }
      System.out.println("reversing entire string:"+str);
      String arr[]=str.split(" ");
      for(int i=arr.length-1;i>=0;i--){        
        sb.append(arr[i]+" ");       
      }
//reverse input string
      System.out.println("reversing each word at its place:"+sb);
//print entire string result

//call reverWordInMyString method

/* 
   Use split() method of String class splits
   a string in several strings based on the
   delimiter passed as an argument to it
*/


/* 
   Use charAt() function returns the character
   at the given position in a string
*/

//print reverse each word string result
}
}