import java.util.*;
class Percentage{
  public static void main(String args[]){
   int math,tel,eng,soc,sci;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the math marks:");
    math=sc.nextInt();
     System.out.println("enter the tel marks:");
    tel=sc.nextInt();
     System.out.println("enter the eng marks:");
    eng=sc.nextInt();
     System.out.println("enter the soc marks:");
    soc=sc.nextInt();
     System.out.println("enter the sci marks:");
    sci=sc.nextInt();
   double sum=(math+tel+eng+soc+sci)/600;
    double percentage= sum*100;   
    
    
  }
}




/* if (percentage<=80&&percentage>=90)
    {
      System.out.println("your grade is A");
      {
        else if (percentage<=60&&percentage>=70)
        {
          System.out.println("your grade is B");
          {
            else if (percentage<=40&&percentage>=50)
            {
              System.out.println("your grade is C");
            }            
          }
          else (percentage<=30)
          {
            System.out.println("your grade is D");
          // */