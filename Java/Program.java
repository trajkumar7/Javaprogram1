//write a prgm to read the of marks 5 subjets and percentage and grades also 
import java.util.*;
class Program{
  public static void main(String args[]){
    int tel,math,eng,sco,sci;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the tel marks:");
    tel=sc.nextInt();
    System.out.println("enter the math marks:");
    math=sc.nextInt();
    System.out.println("enter the eng marks:");
    eng=sc.nextInt();
    System.out.println("enter the sco marks:");
    sco=sc.nextInt();
    System.out.println("enter the sci marks:");
    sci=sc.nextInt();
    double toatl_subjects_marks=(tel+eng+math+sci+sco)/500;
    double percentage=toatl_subjects_marks*100;    
     if (percentage<=80&&percentage<=90)
    {
      System.out.println("your grade is A");
    }
      
        else if (percentage<=60&&percentage<=70)
        {
          System.out.println("your grade is B");
        }
            else if(percentage<=40&&percentage<=50)
            {
              System.out.println("your grade is C");
            }            
          
          else 
           {
         
             System.out.println("your grade is D"); 
           }
        } 
}
   

    

