import java.util.*;
class ArrayExample
  {
    public static void main(String args[])
    {
      int size;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter array elements");
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("array elements are");
      for(int i=0;i<a.length;i++)
        {
          System.out.print(a[i]+" ");
        }
      
    }
  }

/*import java.util.*;
class ArrayExample
  {
    public static void main(String args[])
    {
     int arr[]={34,56,78,90};
      int count=0;
      for(int i=0;i<arr.length;i++)
        {
          count++;
        }
      System.out.println("the length of the array is "+count);
      
              }
  }*/