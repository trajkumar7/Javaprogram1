/* JFM1T13_Assignment2:

     Write a program to iterate through all elements in an ArrayDeque.Using iterator method
     Prompt the user input from the terminal.
     
     Sample Input: 12,31,6,23,90

     Expected Output:  
     ArrayDeque: [12, 31, 6, 23, 90]
     The iterator values are: 
     12
     31
     6
     23
     90
*/
import java.util.*;
import java.util.Scanner;

public class IteratorArrayDeque {
public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);    
  ArrayDeque<Integer> de_que = new ArrayDeque<Integer>();
        de_que.add(12);
        de_que.add(31);
        de_que.add(6);
        de_que.add(23);
        de_que.add(90);
//create Scanner object
System.out.println("ArrayDeque: " + de_que);
//create an empty ArrayDeque
      Iterator value = de_que.iterator();
System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }
//take input from user

//create an iterator

//Display the values after iterating through the Deque 

}