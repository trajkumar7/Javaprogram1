//write a java program to reverse the array eliments 
//  write a java program to find the largest  palindrome (sub string)
/*import java.util.*;
class Exa1{
  public static void main (String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size");
    int n=sc.nextInt();    
    int a[]=new int[n];   
    System.out.println("enter the elements;");
    for (int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }   
    for(int i=0;i<n;i++){
      System.out.println(a[i]);
      System.out.println("Reversed array is: \n");
    }     
    
        for (int i =n-1;i<=0; i--) {                
         System.out.println(a[i]);
        }  
  }
}*/

import java.util.*;
public class Exa1 {
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
    System.out.println("enter the size");
     int s=sc.nextInt();
    int max=0;
    String str=sc.next();
    int n=str.length();
    String st="";
    for (int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        String st=str.substring(i,j);
        for (int i=str.length()-1;i>=0;i--){
      st=st+str.charAt(i);
    }
       rev=st;
      }
    }
    
    System.out.println("the reverse word is:"+st);
    if(st.equals(rev)){
      if(max<str.substring(i,j))
      {
        max=substring(i,j);
     
    }
      
    }  
    System.out.println("the word is palindrome");
  }
}