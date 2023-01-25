import java.util.*;
class SumOfOdd{
  public static void main(String args[]){
    int i=1,n,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the n value");
    n=sc.nextInt();
     /*for(i=1;i<=n;i++)//for loop
       if(i%2!=0)
     {      
      System.out.print(i+" ");
       sum=sum+1;
    }/*////while loop
    while(i<=n){  //while loop
      if(i%2!=0)
      {
        System.out.println(i+" ");
       sum=sum+1;
       } 
    i++;    
   }
   System.out.println("the sum of odd numbers:"+sum);
  }  
}