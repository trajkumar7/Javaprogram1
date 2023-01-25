/*  JFM1T8_Assignment3:

    Write a program to find a substring in a string without using an inbuilt method of String class.
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    Enter search string: bitLabs
    
    Expected output: bitLabs is found
    
    Enter search string: bitlab
    Expected output: bitlab is not found

*/

import java.util.Scanner;
public class SubStringWithoutInbuilt {
//main method	
  static int isSubstring(String s1, String s2)
    {
        int M = s1.length();
        int N = s2.length();
        for (int i = 0; i <= N - M; i++) 
        {
            int j;
            for (j = 0; j < M; j++)
                if (s2.charAt(i + j) != s1.charAt(j))
                    break;
            if (j == M)
                return i;
        }
 
        return -1;
    }

    public static void main(String args[])
    {
        Scanner ntr =new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=ntr.nextLine();
        System.out.println("Enter search string : ");
        String s=ntr.nextLine();
 
        int res = isSubstring(str, s);
 
        if (res == -1)
            System.out.println(s+" is present");
        else
            System.out.println(s+" is not present");
    }
//declare variables

//take input from user

//compare two strings if the search string found or not without using inbuilt method isSubString()

//creat isSubString method in that declare variable 

//check two strings if the search string is present then return true else return false

}

//read the question. you should not use any method from String class
