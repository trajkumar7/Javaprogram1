// print the even numbers and odd numbers
import java.util.*;
class ArrayEven
  {
    public static void main(String args[])
    {
     int size,i,coun=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size ");
      size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the elements ");
      for(i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      
      }
      for(i=0;i<a.length;i++)
      {
        if(a[i]>0)
        {   
          coun++;
        //System.out.println("theconnt is "+coun);
        System.out.println("the even numbers are "+a[i]);
        //System.out.println("theconnt is "+coun);
      }
        
      }
      System.out.println("theconnt is "+coun);
    }     
      
}    