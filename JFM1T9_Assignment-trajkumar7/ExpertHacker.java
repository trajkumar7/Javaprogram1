/*JFM1T9_Assignment2:
    Write a BankAccount class with members account_number and account_balance  and prevent other class objects 
    (assuming them as hackers who can steal your confidential information) to access BankAccount details.
    Steps to Follow:
    Step1: Create account_number and account_balance as member variables for BankAccount class
    Step 2: Add setter and getter methods for the above member variables 
    Prompt the user for the  values to be input from the terminal.

    Sample Input:
    Enter BankAccount Number : 6789023
    Enter Current Balance    : 67,000.89

    Expected Output:
    BankAccount Number : 6789023
    Current Balance    : 67000.89
    
*/
import java.util.*;
class BankAccount { 
//declare account_number , account_balance
int  acc;
  int bal;
  Scanner ntr=new Scanner(System.in);
  void setAcc(int acc)
  {
    this.acc=acc;
     
  }
  public int getAcc()
  {
    return acc;
  }
   void setBal(int bal)
  {
    this.bal=bal;
      
  }
  public int getBal()
  {
    return bal;
  }
   
}  
//create getters and setters
   
class ExpertHacker {
public static void main(String args[]) {
//main method
Scanner ntr=new Scanner(System.in);
  BankAccount obj=new BankAccount();
     System.out.print("Enter BankAccount Number : ");
      int Account=ntr.nextInt();
    System.out.print("Enter Current Balance    : ");
      int Balance=ntr.nextInt();
    System.out.println();
    obj.setAcc(Account);
    System.out.print("BankAccount Number : "+obj.getAcc()+"\n");
    obj.setBal(Balance);
    System.out.print("Current Balance    : "+obj.getBal());
//create Scanner object

//Take input from user

//Create an object of BankAccount class and set account_number and the account_balance

// Try accessing fields of BankAcccount class and check whether it's accessible 

// or not. If not then try accessing it with it’s setter and getter methods. 

// Print account_number and account_balance 

}   

} 