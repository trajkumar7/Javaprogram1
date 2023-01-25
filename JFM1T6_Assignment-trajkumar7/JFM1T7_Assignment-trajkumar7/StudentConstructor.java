/* JFM1T7_Assignment1:

   Write a program to initialize data members of Student class using constructor.
   Prompt the user for the  values to be input from the terminal

   Sample Input:
   Enter student name: Shree Balaji
   Enter student Roll no: 01

   Expected Output:
   Name: Shree Balaji    Roll no: 01

*/
import java.util.*;
import java.util.Scanner;
public class StudentConstructor {
  StudentConstructor(){
    Scanner ntr=new Scanner(System.in);
    System.out.println("Enter student name:");
    String name=ntr.nextLine();
    System.out.println("Enter student Roll no:");
    int n=ntr.nextInt();
    System.out.println("Name: "+name+"  Roll no: "+n);
  }
  public static void main(String[]args)
  {
    StudentConstructor obj=new StudentConstructor();
  }
//initialize Student class using constructor

//Get student name and rollno from user and set it to the Student object  

//print result
} 
//Create Student class in that declare variables name and roll number 

//add  setter method for rollno
public void setRollNo(int rollNum){ 
         this.rollNo = rollNum; 
} 

//add getter method for rollno
public int getRollNo(){ 
      return this.rollNo; 
} 


//add setters and getters for name fields also