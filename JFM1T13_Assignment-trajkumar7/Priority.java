/* JFM1T13_Assignment1

     Write a program to create a priority queue, add some colors (string) and print out the elements of the priority queue. 
     Prompt the user input from the terminal.
     
     Sample Input: 
     Enter how many colors you want: 
     5
     Enter Colors: 
     red
     white
     green
     orange
     black
     
     Expected Output:
     Elements of the Priority Queue:  black, green, orange, red, white 
*/
import java.util.*;
import java.util.Scanner;

public class Priority {

//maiin method
public static void main(String[]args){
//creat Scanner object
Scanner sc=new Scanner(System.in);
  System.out.println("Enter how many colors you want: ");
  int num=sc.nextInt();
  System.out.println(" Enter Colors: ");
  PriorityQueue<String> pq = new PriorityQueue<String>();
  
        for(int i=0;i<num;i++){
            pq.add(sc.next());         
        }
  System.out.println(pq);
  for(int i=0;i<num;i++){
 System.out.println(pq.poll());
  }  
//initialize priority queue object  
  
//take input from user and add that values to the priority queue object

//print result using poll method
}
}