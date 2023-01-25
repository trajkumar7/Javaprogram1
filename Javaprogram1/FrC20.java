import java.util.*;
class Raj{
  public static void main(String args[]){
    int num,result=0,digit=0,temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the num:");
    num=sc.nextInt();
    temp=num;
    while(num>0)
      {
        digit=num%10;//121%10//1 ==12%10//2 2%10==0
        result=result*10+digit;//resutl=1//10+2==12//121
        num=num/10;//121/10=12//12/10//2//2/10
      }
    System.out.println("the firstdigit number  "+digit+ "last digit"+result/100);
   // System.out.println(num);
    
  /*if(temp==result){
  System.out.println("the number is plndrum");
  }
else{
  System.out.println("the number is not pelndrum");*/
   }
  }
