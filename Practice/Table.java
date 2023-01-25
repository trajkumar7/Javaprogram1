import java.util.*;
class Table{
  public static void main(String args[]){
    int i=1,n,num;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the which table you want");
    num=sc.nextInt();
    System.out.println("enter n value:");
    n=sc.nextInt();
    //for loop
    /*for(i=1;i<=n;i++){
      int res=num*i;
      System.out.println(i+"*"+num+"="+res);
    }*////while loop
    while(i<=n){
       int res=num*i;
      System.out.println(i+"*"+num+"="+res);
      i++;
    }
    
  }
}