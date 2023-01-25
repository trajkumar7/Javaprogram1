//for insert the element in last
/*class AddElement
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size : ");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the elements : ");
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }  
         n=a.length;
      int b[]=new int[n+1];
      System.out.println("enter the element to insert : ");
      int ele=sc.nextInt();
      int i;
      for(i=0;i<n;i++)
        {
          b[i]=a[i];
        }
      b[i]=ele;
    System.out.println("elements  in the second array ");
      for(i=0;i<b.length;i++)
        {
          System.out.print(b[i]+" ");
        }
    }   
      
  }
*/
/*import java.util.*;
class Insert
  {
    public static void main(String args[])
    {
      int size;
      Scanner sc=new Scanner(System.in);
      size=sc.nextInt();
      int arr[]=new int[size];
      int newarr[]=new int[size+1];
      System.out.println("enter the elements ");
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("enter the position of element you want to insert");
      int pos=sc.nextInt();
      System.out.println("enter the element you want to insert");
      int ele=sc.nextInt();
      for(int i=0;i<arr.length;i++)
        {
          if(i==pos)
          {
            newarr[i]=ele;
            newarr[i+1]=arr[i];
          }
          else if(i<pos)
          {
            newarr[i]=arr[i];
          }
          else
            newarr[i+1]=arr[i];
        }
      System.out.println("after inserting the element");
      for(int i=0;i<newarr.length;i++)
        {
          System.out.print(newarr[i]+" ");
        }
    }
  }*/
