/*  JFM1T12_Assignmwnt4:

    Write a Java program to reverse elements in an arraylist.
    Prompt the user input from the terminal.
     
    Sample Input:
    Enter how many numbers you want: 
    5
    Enter Number 0
    995
    Enter Number 1
    367
    Enter Number 2
    511
    Enter Number 3
    789
    Enter Number 4
    111
    
    Expected Output:
    Elements after reversing:111 789 511 367 995  

 */
import java.util.*;
import java.util.Scanner; 
import java.util.ArrayList; 

class Reverse1 { 
  public ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist){
        for (int i = 0; i < alist.size() / 2; i++) {
            Integer temp = alist.get(i);
            alist.set(i, alist.get(alist.size() - i - 1));
            alist.set(alist.size() - i - 1, temp);
        }
    return alist;
  }
  
    public void printElements(ArrayList<Integer> alist)
    {
        for (int i = 0; i < alist.size(); i++) {
            System.out.print(alist.get(i) + " ");
        }
    }
}
    public class ReverseArrayList{
    public static void main(String args[])
    {
       Reverse1 obj=new Reverse1();
      
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter how many numbers you want: ");
  int size=sc.nextInt();        
        ArrayList<Integer> al = new ArrayList<Integer>();    
       for(int i=0;i<size;i++){
    System.out.println("Enter Number: "+(0+i));
    al.add(sc.nextInt());  
       }
      System.out.print("Elements before reversing: ");
        obj.printElements(al);
        al = obj.reverseArrayList(al);
        System.out.print("\nElements after reversing: ");
        obj.printElements(al);

//Take an arraylist as a parameter and returns a reversed arraylist 

//Arraylist for storing reversed elements

//Append the elements in reverse order 

//Return the reversed arraylist

//Iterate through all the elements and print

//main method

//creat an object of ReverseArrayList class 

//take input from user

//creat an object of ArrayList class

//call reverseArrayList method

//call printElement method
  }
}