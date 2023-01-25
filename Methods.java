//with return type and without argument
/*import java.util.*;
class Methods{
  public static int mut(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the a,b value:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=a*b;
    return c;
  }
  public static void main(String args[]){
    int result=mut();
    System.out.println("the mut of 2 numbers is:"+result);
  }
}*/
/*
//with return type and with argument
import java.util.*;
class Methods{
  public static int mut(int x,int y){
    int c=x*y;
    return c;
  } 
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
      System.out.println("enter the a,b values:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int result=mut(a,b);
    System.out.println("the muti of 2numbers:"+result);
 }
}*/
class Methods
  {
    int a=20;//instance
    static int b=40;
    public static void main(String args[])
    {
      int a=10;int b=20;
      int c=a+b;
      System.out.println("the value is:"+c);
      Methods obj=new Methods();//using obj  
      System.out.println("the value is:"+obj.a);
      System.out.println("the value is:"+b);
    }
  }
 
