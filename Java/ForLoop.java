//only total numbers sum
/*class ForLoop{
  public static void main(String args[]){
    int i,sum=0;
    for (i=1;i<=100;i++)
      {
        System.out.print(i+ " ");
        sum=sum+i;
      }
    
    System.out.println("th iteration value is:"+sum);
  }
}*/
//1-n number primt 
/*import java.util.*;
class ForLoop{
  public static void main(String args[]){
    int i,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("ente n value");
    n=sc.nextInt();
    for (i=1;i<=n;i++)
      {
        System.out.print(i+ " ");
        
      }
    
    System.out.println("th iteration value is:"+i);
  }
}*/

//the even numbers of n numbers and also sum of even
/*import java.util.*;
class ForLoop{
  public static void main(String args[]){
    int i,n,sum=0;
     Scanner sc=new Scanner(System.in);
    System.out.println("ente n value");
    n=sc.nextInt();
    for (i=1;i<=n;i++)
       if(i%2==0)
         {
           sum=sum+i;
           System.out.print(i+" ");
           
         }
    
    
    
    System.out.println("th sum of even value is:"+sum);
  }
}*/
//sum of add numners 
import java.util.*;
class ForLoop{
  public static void main(String args[]){
    int i,n,sum=0;
     Scanner sc=new Scanner(System.in);
    System.out.println("ente n value");
    n=sc.nextInt();
    for (i=0;i<=n;i++)
       if(i%2!=0)
         {
           sum=sum+i;
           System.out.println(i);
           
         }    
    
    System.out.println("th sum of odd value is:"+sum);
  }
}