import java.util.*;
class ExamString
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String s;
      int count=0;
     System.out.println("enter the string");
      s=sc.nextLine();
      String s1[]=s.split(" ");
      for(int i=0;i<s1.length;i++)
        {
          count++;
         // System.out.println(s1[i]);
        }
      System.out.println("the count of words in a given string are : "+count);
     
    }
  }
