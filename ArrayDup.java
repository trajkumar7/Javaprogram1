//print the  duplicate values
import java.util.*;
class ArrayDup{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the elements");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("the elements are : ");
    for(int i=0;i<arr.length;i++)
    { 
      for(int j=i+1;j<arr.length;j++)
          {
            if(arr[i]==arr[j])
            {
              System.out.println(arr[j]+" is the duplicate number");
            }
          }
   
     }
  }
}  

/*import java.util.*;
class DupArray
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("Enter the size : ");
    n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the Elements : ");
    for(int i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
      }
    System.out.println("the elements are : ");
    for(int i=0;i<arr.length;i++)
      {
        for(int j=i+1;j<arr.length;j++)
          {
            if(arr[i]==arr[j])
            {
              System.out.println(arr[j]+" is the duplicate number");
            }
          }
       }
    }
}*/