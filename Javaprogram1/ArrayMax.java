//print the minimum and amximu value of given numbers
import java.util.*;
class ArrayMax{
  public static void main(String args[]){
    int min;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the elements");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    min=arr[0];
    for(int i=0;i<arr.length;i++){
      
      if(arr[i]<min)//if(arr[i]>max) to maximum
      {
        min=arr[i];
      }
    }
   System.out.println("the minimum element of arry is"+min); 
  }
}