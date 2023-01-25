/* import java.util.*;
class Prime{
  public static void main(String args[])
  {
    int i,num,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    num=sc.nextInt();
    for(i=1;i<=num;i++)
      {
        if(num%i== 0)
        {
          count++;
        }
      }
        if(count==2)
        {
          System.out.println("given number is prime");
        }
        else
        {
          System.out.println("not prime");
        }
      
  }
}*/
import java.util.Scanner;

public class Prime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, count;
        System.out.println("Enter lower bound of the interval: ");
        a = sc.nextInt(); 
        System.out.println("\nEnter upper bound of the interval: ");
        b = sc.nextInt(); 
        System.out.println("\nPrime numbers between "+a+" and "+b+" are: ");
        for (int i=a;i<=b;i++)
          {
            if (i==1 || i==0)
              continue;
            count=1;
            for (int j=2;j<=i/2;++j)
              {
                if (i % j == 0)
                {
                    count=0;
                    break;
                }
             }
            if (count==1)
                System.out.println(i);
         }
    }
}