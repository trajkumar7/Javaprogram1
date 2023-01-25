/*import java.util.*;
class Factorial{
  public static void main(String args[]){
    int num,fact=1;
    Sacnner sc=new Scanner(System.in);
    System.out.println("enter the num:");
    num=sc.nextInt();
    for(int i=1;i<=num;i++){
      fact=fact*i;
    }
    System.out.println("the factorial of"+num+ "="+fact);
  }
}  
/*import java.util.*;
class Factorial{
  public static void main(String args[])
  {
    int num,fact=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    num=sc.nextInt();
    for(int i=1;i<=num;i++)
      {
      fact=fact*i;
        
      }
    System.out.println("factorial of "+num+"="+fact);
  }
}



//first and last digit
/*import java.util.*;

class Reverse {
  public static void main(String args[]) {
    int num, first = 0, last = 0, digit = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number" );
    num = sc.nextInt();
    last = num % 10;
    while (num > 0) {
      digit = num % 10;
      num = num / 10;
      System.out.println(num);
    }
   first=digit;
    System.out.println("first: " + first + "  "+"last digt:" + "  "+last);

  }
}*/
import java.util.*;
class Factorial{
  public static void main(String args[]){
    int num,fact=1,digit=0,sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number" );
    num = sc.nextInt();
    int temp=num;
    while(num>0)
      {
        digit=num%10;
        fact=1;
        for(int i=1;i<digit;i++){
          fact=fact*i;
          sum=sum+fact;
        }
        
        num=num/10;
      }
    if(temp==num){
      System.out.println("the strong number");
    }
    else{
      System.out.println("the number is not strong");
    }
  }
}

