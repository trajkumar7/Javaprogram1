import java.util.*;
class GrossSalary{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int salary,HRA,DA,gross;
    System.out.println("enter the basic salary of employ:");
    salary=sc.nextInt();
    

    if (salary<=10000)
    {
      HRA=(salary*20)/100;
      DA=(salary*80)/100;
      gross=salary+HRA+DA;
      System.out.println("the GRS is:"+gross);
    }
    else if (salary>10000&&salary>=20000)
    {
      HRA=(salary*90)/100;
      DA=(salary*25)/100;
      gross=salary+HRA+DA;
      System.out.println("the GRS is:"+salary+HRA+DA);
    }
    else if (salary>20000)
    {
      HRA=(salary*30)/100;
      DA=(salary*95)/100;
      gross=salary+HRA+DA;
      System.out.println("the GRS is:"+salary+HRA+DA);
    }
      else
    {
      System.out.println("the no eligible for HRA and DA");
    }
  }
}