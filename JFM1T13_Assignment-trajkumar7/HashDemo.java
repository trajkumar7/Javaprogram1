/*    JFM1T13_Assignment5:  

      Create an application having a Generic HashMap with Empcode  as key and EmpName as value. Display only EmpNames as output. 
       Prompt the user input from the terminal.

      Sample Input: 
      Enter Emp code:101
      Enter Emp Name: Ram
      Enter another student (y/n)?y
      Enter Emp code:102
      Enter Emp Name: Vaibhav
      Enter another student (y/n)?y
      Enter Emp code:103
      Enter Emp Name: Priyanka
      Enter another student (y/n)?n

      Expected Output: 
        Ram
        Vaibhav
        Priyanka
       
*/
import java.util.*;
import java.util.Scanner;
import java.util.HashMap;

public class HashDemo {

//main method
  public static void main(String args[])
    {
      char ch;
      Scanner sc=new Scanner(System.in);
//declare the HashMap 
HashMap<Integer,String> hm=new HashMap<Integer,String>();
do{
System.out.println("Enter Emp code:");
int key=sc.nextInt();
System.out.println("Enter Emp name:");
String value=sc.next();
hm.put(key,value);
System.out.println("Enter another student (y/n)? ");
ch=sc.next().charAt(0);
 }

//create a while loop for user not enter no
 while(ch=='y');
      for(Map.Entry m:hm.entrySet())
        {
          System.out.println(m.getValue());
        } 
}    
//ask for user input for value and key

//add the user inputs to the HashMap

//ask user if they want to enter another student details

//condition to satisfy in order to loop again

//use for each loop to grab Emp code and Emp Name

//print Emp Name

}