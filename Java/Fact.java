//factors of n numbers
import java.util.*;
class Fact{
  public static void main(String args[])
  {
    int i,num,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    num=sc.nextInt();
    for(i=1;i<=num;i++)
      {
        if(num%i==0)
        {
          System.out.println(i);
        }
      }
        
  }
}