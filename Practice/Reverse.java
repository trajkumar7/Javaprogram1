//non static method
import java.util.*;
class Reverse{
  public void palindroum(String s){
    String str="";
    for (int i=s.length()-1;i>=0;i--){
      str=str+s.charAt(i);
    }
    System.out.println("the reverse word is:"+str);
      if(s.equalsIgnoreCase(str))
      {
        System.out.println(str+" "+"is a palindrome");
      }
      else
        System.out.println("not a palindrome");
  }   
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
     String s=sc.nextLine();  
      Reverse res=new Reverse();
      res.palindroum(s);
    }
  }

