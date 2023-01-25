import java.util.*;
class Notes{
  public static void main(String args[]){

    int amount,a;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the amount:");
     amount=sc.nextInt();
    if (amount>=1000)
    {
       a=amount/1000;
      System.out.println("the 5000 notes are :"+a);
      amount=amount-(a*1000);
      if (amount>=500){
        a=amount/500;
        System.out.println("the 500 notes are:"+a);
        amount=amount-(a*500);
      }
      if (amount>=100)
      {
         a=amount/100;
        System.out.println("the 100 notes are:"+a);
        amount=amount-(a*100);
      }
      if (amount>=50);
      {
         a=amount/50;
        System.out.println("the 50 notes are:"+a);
        amount=amount-(a*50);
      }  
      if (amount>=10);
      {
         a=amount/10;
        System.out.println("the 10 notes are:"+a);
        
      }
    }
  }
}
/*
mport java.util.*;
class Notes
  {
    public static void main(String args[])
    {
      int amount,res;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the amount");
      amount=sc.nextInt();
      if(amount>=1000)
      {
        res=amount/1000;
        System.out.println("the 1000 rupees notes are:"+res);
        amount=(amount-(res*1000));
      }
      if(amount>=100)
      {
        res=amount/100;
        System.out.println("the 100 rupees notes are:"+res);
        amount=(amount-(res*100));
      }
      if(amount>=50)
      {
        res=amount/50;
        System.out.println("the 50 rupees notes are:"+res);
        amount=(amount-(res*50));
      }
      if(amount>=10)
      {
         res=amount/10;
        System.out.println("the 10 rupees notes are:"+res);
        amount=(amount-(res*10));
      }
      if(amount>=1)
      {
       res=amount/1;
        System.out.println("the 1 rupees notes are:"+res);
       
      }
    
    }
  }*/
/*import java.util.*;
class Sample3
  {
    public static void main(String args[])
    {
     int number;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      number=sc.nextInt();
      switch(number)
        {
          case 1:
            System.out.println("this first statement is executed");
          break;
          case 2:
            System.out.println("this second statement is executed");
          break;
          case 3:
            System.out.println("this third statemnt is executed");
            break;
          default:
            System.out.println("the default statement is to  be executed");
        }
    }
  }*/