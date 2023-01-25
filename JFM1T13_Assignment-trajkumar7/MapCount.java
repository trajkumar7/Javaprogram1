/*  JFM1T13_Assignment3:

      Write a Java program to count the number of key-value (size) mappings in a map. 
      Prompt the user input from the terminal.

      Sample Input: 
      Enter value:20
      Enter key:bitLabs
      Enter another student (y/n)?y
      Enter value:25
      Enter key:welcomes
      Enter another student (y/n)?y
      Enter value:30 
      Enter key:you
      Enter another student (y/n)?n

      Expected Output: The size of the map is 3
*/
import java.util.*;
//import java.util.scanner:
public class MapCount {
//main method
public static void main (String []args){
//declare HashMap object
  char ch;
  Scanner sc=new Scanner(System.in);
HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
//create a while loop for user not enter no
do{
System.out.println("Enter value:");
int key=sc.nextInt();
System.out.println("Enter key:");
String value=sc.next();
hash_map.put(key,value);
System.out.println("Enter another student (y/n)? ");
ch=sc.next().charAt(0);
 }
//ask for user input for value and key
while(ch=='y');
      for(Map.Entry m:hash_map.entrySet())
        {
          System.out.println(m.getValue());
        } 
 System.out.println("The size of the map is " + hash_map.size());
    
//add the user inputs to the HashMap

//ask user if they want to enter another

//condition to satisfy in order to loop again

//print total size as result
}
}