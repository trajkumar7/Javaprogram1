import java.util.*;
class OddnmsOnly{
  public static void main(String args[]){
    int i=1,num;
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
    for(i=1;i<=num;i++)
      {
        if(i%2!=0){
        System.out.print(i+" ");
        }  
      }
  }
}