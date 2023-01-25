import java.util.*;
class Electricbill{
  public static void main(String args[]){
   int units;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the units we have:");
    units=sc.nextInt();
    if (units<=50)
    {
      double bill=(units*0.50);
      double bills=bill*(20/100);
      System.out.println("the electricityubill is:" +bills);
    }
    else if(units<=150)
    {
     double bill=((((units-50)*0.75))+(50*0.50));
      double bills=bill*(20/100);
      System.out.println("the electricityubill is:" +bills);
    }
    else if(units<=250)
    {
      double bill=(((units-150)*1.20)+(100*0.75)+(50*0.50));
      double bills=bill*(20/100);
      System.out.println("the electricityubill is:" +bills);
    }
    else if(units>=250)
      {
       double bill=(((units-250)*1.50)+(100*0.75)+(50*0.50));
        double bills=bill*(20/100);
       System.out.println("the electricityubill is:" +bills);
      }
    
  }
  
}












/*mport java.util.*;
class ElectricityBill
  {
    public static void main(String args[])
    {
      int units;
      double bill;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the units");
      units=sc.nextInt();
      if(units<=50)
      {
        bill=(units*0.50);        
      }
      else if(units<=150)
      {
        bill=((units-50)*0.75)+(50*0.50);
      }
      else if(units<=250)
      {
        bill=((units-150)*1.20)+(50*0.50)+(100*0.75);
      }
      else{
        bill=((units-250)*1.50)+(50*0.50)+(100*0.75)+(100*1.20);
      }
      double price=bill+((bill*20)/100);
      System.out.println("the electricity bill is:"+price);
    }
  }






*/