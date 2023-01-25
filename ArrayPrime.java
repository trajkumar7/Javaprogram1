//print prime numbers
import java.util.*;
class ArrayPrime{
   public static void main(String args[]){
    int count;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the elements");
    for(int i=0;i<arr.length;i++)
    {
      arr[i]=sc.nextInt();
    }
        for(i=0;i<arr.length;i++)
        {
          for(j=1;j<arr[i];j++) 
        {      
          if(arr[i]%j==0)
           {
            count++;
           }
       }
        if(count==2){
         System.out.println(arr[i]);
        }
    }
 }
}  
   
/*//Print the prime numbers from the array
import java.util.*;
class ArrayPrime
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("enter the values ");
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("the prime numbers in the given array:");
      for(int i=0;i<arr.length;i++)
        {
          int count=0;
          for(int j=1;j<=arr[i];j++)
            {
              if(arr[i]%j==0)
              {
                count++;
              }
            }
          if(count==2)
          {
            System.out.println(arr[i]);
          }
            
        }  
    }
  }*/