// delet the elements for array 
import java.util.*;
class ArrayDelet
  {
    public static void main(String args[])
    {
      int a[]={23,56,34,90,45};
        Scanner sc=new Scanner(System.in);
      System.out.println("enter the element positon to remove");
      int pos=sc.nextInt();
      for(int i=0;i<a.length-1;i++)
        {
          if(pos==i)
          {
            a[i]=a[i+1];
          }
          else if(i>pos)
            a[i]=a[i+1];
        else
            a[i]=a[i];
        }
         System.out.println("the elements after remove");
      for(int i=0;i<a.length-1;i++)
        {
          System.out.print(a[i]+" ");
        }

    }
  }