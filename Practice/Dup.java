//Duplicate values
import java.util.*;
class Dup{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the array size");
    int a=sc.nextInt();
   int arr[]=new int[a];
    System.out.println("enter the array elements");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    int c[]=new int[a];
    for(int i=0;i<arr.length;i++){
      //int c[]=new int[a];
      c[i]=arr[i];
      //System.out.println(" the array elements are"+c[i]);
    }
    for(int i=0;i<c.length;i++){
      
      System.out.print(c[i]+" ");
    }
     
    /*System.out.println("Duplicate elements are: ");  
      for(int i=0;i<arr.length;i++){          
        
    for(int j=i+1;j<arr.length;j++){
       if(arr[i] == arr[j])  
       System.out.println(arr[i]);  
    }  
  }*/
 }
}