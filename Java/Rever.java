////reverse numner
/*import java.util.*;
class Rever{
  public static void main(String args[]){
    long num,result=0,digit=0;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the n value:");
    num=sc.nextInt();
    while(num>0)
      {
        digit=num%10;
        result=result*10+digit;            
        num=num/10;
      }
      System.out.println("the reverse number is:"+result%10000);
  }
}*/
/// reverse and display first and last digit
import java.util.*;
class Rever
  {
    public static void main(String args[])
    {
      int num,first=0,last=0,digit=0,rev=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number to reverse");
      num=sc.nextInt();
      first=num%10;
      while(num>0)
        {
          digit=num%10;
          rev=rev*10+digit;
          num=num/10;
         
        }
      System.out.println(rev);
     last=digit;
      System.out.println("first digit "+first+"  "+"last digt"+"   "+last);
           
    }
  }