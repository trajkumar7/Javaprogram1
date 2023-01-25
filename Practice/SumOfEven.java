import java.util.*;
class SumOfEven{
  public static void main(String args[]){
    int i=1,n,sum=0;
    Scanner sc=new Scanner (System.in);
    System.out.println("ente n value:");
    n=sc.nextInt();
    //for loop
    /*for(i=1;i<=n;i++){
      if(i%2==0){
        System.out.println(i+" ");
        sum=sum+1;
      }
    }*////while loop
   while(i<=n)
    {
      if (i%2==0)
      {
        System.out.println(i+" ");
        sum=sum+1;
      }
      i++;
    }
    System.out.println("the sum of even numbers:"+sum);
  }
}