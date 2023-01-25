import java.util.*;
class ArrayNegetive
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
        if(i>0 &a[i]==1)
        {   
          coun++;
      
        System.out.println("the positive numbers are "+i);
        
      }
        else{
          System.out.println("the given number is negtv");
        }
        
      }
      System.out.println("theconnt is "+coun);
    }     
      
}    