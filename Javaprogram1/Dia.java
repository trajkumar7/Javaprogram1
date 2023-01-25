/*import java.util.*;
class Dia
  {
    public static void main(String[]args)
    {
      Scanner ntr=new Scanner(System.in);
      int v;
      System.out.print("Enter the value for ROWS : ");
      v=ntr.nextInt();
      System.out.println(" ");
      for(int i=0;i<=v;i++)
        {
         // for(int j=(v-i);j>=0;j--)
           // {
               //System.out.print(" ");
           // }
          for(int j=0;j<=i;j++)
            {
              System.out.print("* " );
            }
          System.out.println(" ");
        }
     
    }
  }/*

//reverse diamond patter
class Dia
  {
    public static void main(String args[]){
           
      for(int i=0;i<=5;i++)
        {
          for(int j=0;j<=i;j++)
            {
              System.out.print(" ");
            }
          for(int k=5;k>i;k--)
            {
              System.out.print("*");
            }
          System.out.println("");
        }
    }
  }


/*class Dia{
    public static void main(String args[]){
        char ch='a';
        for(int i=5;i>0;i--){
            for(int j=0;j<=i;j++){
                System.out.print((ch++)+"");
            }
            System.out.println();
        }
    }
}*/

/*import java.util.*;
class Dia{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value:");
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*" +" ");
            } 
            System.out.println( );   
        }
       
    }
}*/

public class Dia {
//Add main method here
  public static void main(String args[])
{

//Declare variables i,j,k,m and initialize ch=97(because we are printing alphabet a)
  int i,j,k,m;
char ch=97;
//use for loop and if condition to print a,b,c 
  for(i=0;i<=2;i++)
     {
         for(m=i;m<=4;m++)
         {
             System.out.print("  ");
         }
         for(j=0;j<=i;j++)
         {
         System.out.print((char)(ch+j)+" ");
         }
         for(k=i-1;k>=0;k--)
         {
             System.out.print((char)(ch+k)+" ");
         }
        System.out.println();
     }
     for(i=1;i>=0;i--)
     {
         for(m=i;m<=4;m++)
         {
             System.out.print("  ");
         }
         for(j=0;j<=i;j++)
         {
         System.out.print((char)(ch+j)+" ");
         }
         for(k=i-1;k>=0;k--)
         {
             System.out.print((char)(ch+k)+" ");
         }
        System.out.println();
     }
}

}