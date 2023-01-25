//sorting elements in array
/*class Sorting
{
public static void main(String args[])
{
int arr[]={10,32,23,45,89,56};
int temp=0;
System.out.println("elements before sorting:");
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
  System.out.println();
System.out.println("elements after sorting");
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}
}
}*/

//print the given number is in array or not
import java.util.*;
class Sorting
{
   public static void main(String args[]){
     int pos=0,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the elements");
      for(int i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
      }
     System.out.println("enter the element");
     int a=sc.nextInt();
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]==a)
        {
          pos=i;
          count++;
        }
      }
     if(count>0)
     {       
           System.out.println("the number is in array position is"+(pos));
        
      }
     else{
          System.out.println("the number is not found");
        }
   }
}

