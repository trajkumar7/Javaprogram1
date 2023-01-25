import java.util.*;
class Reverse
  {
    public static void main(String args[])
    {
      int num,result=0,digit=0;
      int i=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number to reverse");
      num=sc.nextInt();
      while(num>0)
        {
          digit=num%10;
          result=result*10+digit;
          num=num/10;
        }  
      System.out.println("the reverse of a number is "+result);
      
      
    }
  }