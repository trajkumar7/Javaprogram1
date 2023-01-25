import java.util.*;
class Leapyear
  {
    public static void main(String args[])
    {
      int year;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the year to check:");
      year=sc.nextInt();
      if((year%4==0 && year%100!=0)||(year%400==0))
        {
        System.out.println("the given year is a leap year");
        }
      else
      {
        System.out.println("not a leap year");
      }
      
    }
  }