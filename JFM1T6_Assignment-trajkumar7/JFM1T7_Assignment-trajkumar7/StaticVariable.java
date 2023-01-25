/*  JFM1T7_Assignment4:

    Write a program to declare a static variable roll_number inside student class. Create 3 student objects and print their names and roll numbers.
    Hint: Use increment operator to get different value of roll_number for 3 students.

   
    Expected Output:
    Roll no:1  Name: Shree 
    Roll no:2  Name: Balaji
    Roll no:3  Name: Ajay
*/
public class StaticVariable {
//main method
  static int Rollno=0;
  String name;
  StaticVariable(String name){
     Rollno++;
      System.out.println("Rollno is: "+Rollno+" "+"Name is: "+name);
      
   }
    public static void main(String args[])
    {
         StaticVariable s1 = new StaticVariable("Shree");
         StaticVariable s2 = new StaticVariable("Balaji");
         StaticVariable s3= new StaticVariable("Ajay");    
    }

//initializing Student class constructor by 3 times and passing 3 student names

//displaying student name and roll number    
}

//declare Student class andd add declare name, rollno(static)

//add getters and setterss