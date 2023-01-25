/* JFM1T6_Assignment1:

   Write an Employee class with any 3 properties and create 2 employee objects to store and display the data.
   Prompt the user for the 2 employees to be input from the terminal.

   Sample Input:
   Enter the Empid: 01
   Enter the Name: Sree
   Enter Salary: 1000
   Enter the Empid: 02
   Enter the Name: Balaji
   Enter Salary: 2000

   Expected Output:
   **** Stored data displayed below ****
   Employee id = 01
   Employee name = Sree
   Employee salary = 1000
   Employee id = 02
   Employee name = Balaji
   Employee salary = 2000

*/

import java.util.Scanner;

public class Employee {

//Declare the variables
 int empid;
 String name;
 int salary;

//Create a method getInput() 

public  void getInput(){

//create Scanner object
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the empid :: ");
  empid = in.nextInt();
  System.out.print("Enter the name :: ");
  name = in.next();
  System.out.print("Enter the salary :: ");
  salary = in.nextInt();
//take input from user

}

//create display method
public void display(){
  System.out.println("Employee id = " + empid);
  System.out.println("Employee name = " + name);
  System.out.println("Employee salary = " + salary);
 
//Print Employee details
}
  public static void main(String[] args) {
 
  Employee e[] = new Employee[2];
  
  for(int i=0; i<2; i++) {
   
   e[i] = new Employee();
   e[i].getInput();
  }
    System.out.println("**** Stored data displayed below ****");
  
  for(int i=0; i<2; i++) {
   
   e[i].display();
  }
  }
//Create a Employee constructor with the two employees

//check for loop to print two employee details

}