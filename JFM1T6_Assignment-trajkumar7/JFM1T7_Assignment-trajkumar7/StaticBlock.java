/* JFM1T7_Assignment5:

   Write a program to create a static method named dispCollegeName to print the value of a static variable  college_name initialized using static block.
   Access this method from another class and display college_name for 3 students who study in same college.
   Prompt the user for the  values to be input from the terminal

   Sample Input:
   Enter the student name: Sri
   Enter the student Roll no: 1
   Enter the student name: Balaji
   Enter the student Roll no: 2
   Enter the student name: Ram
   Enter the student Roll no: 3
   
   Expected Output:
   Student name: Sri
   Student Roll no: 1
   College Name : IIT
   Student name: Balaji
   Student Roll no: 2
   College Name : IIT
   Student name: Ram
   Student Roll no: 3
   College Name : IIT

*/
import java.util.*;
public class StaticBlock { 
 //main method
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    //initialize Student class constructor for three times
    Student st1=new Student();
    Student st2=new Student();
    Student st3=new Student();

    //Create an array and add the 3 student to it
    Student arr[]={st1,st2,st3};
    
    for(int i=0;i<3;i++){
        
        System.out.print("Enter the student name:");
        arr[i].name=sc.next();
        System.out.print("Enter the student Roll no: ");
        arr[i].rollNo=sc.nextInt();               
    }System.out.println("the student details are");
        
    for (int i=0;i<3;i++){
        System.out.println("Student name is: "+arr[i].name);
      System.out.println("Student Rollo no "+arr[i].rollNo);
      Student.dispCollegeName();
        
    }
}
  
}
class Student {
  static String collegeName;
  String name;
  int rollNo;
  static{
   collegeName="IIT";
 }
  public static void dispCollegeName(){
    System.out.println("College Name : "+collegeName);
  }
 
}
//take input from user 3 times using for loop 

//creating Student class and declaring variables

//creating staticBlock in that give collegename

//add getters and setters

//creating dispCollegename static method 
     


