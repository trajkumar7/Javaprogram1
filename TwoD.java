
class TwoD{
  public static void main(String args[]){
    int a[][]=new int[2][2];
    a[0][0]=35;
    a[0][1]=45;
    a[1][0]=40;
    a[1][1]=55;
    System.out.println("the array elelments:");
    for(int i=0;i<2;i++) //for rows
      {
        for(int j=0;j<2;j++){//foe colum
          {
             System.out.println(a[i][j]+ " ");
          }
          System.out.println();
        }
      }
  }
}

/*//flaot values
import java.util.*;
class TwoD{
  public static void main(String args[]){
  //  float a[][]=new float[3][4];
   // float arr[][]={{34.2f,25.2f,56.1f},{12.4f,15.5f,19.3f},{9.1f,8.2f,7.2f}};
   /* a[0][0]=35.2f;
    a[0][1]=45.4f;
    a[0][2]=45.4f;
    a[0][3]=25.4f;
    a[1][0]=40.2f;
    a[1][1]=55.2f;
    a[1][2]=45.4f;
    a[1][3]=15.4f;
    a[2][0]=40.2f;
    a[2][1]=55.2f;
    a[2][2]=45.4f;
    a[2][3]=15.4f;
    int r,c,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("the rows size  and colum size :");
    r=sc.nextInt();
    c=sc.nextInt();
    int a[][]=new int[r][c];
    System.out.println("enter the values in to 2D array");
    for(i=0;i<r;i++) //for rows
      {
        for(int j=0;j<c;j++)//foe colum
          {
           a[i][j]=sc.nextInt();
         }
        System.out.println("the array element are");
           for( i=0;i<r;i++)
          {
            for(int j=0;j<c;j++)
             {
              System.out.print("["+i+"]["+j+"]: "+a[i][j]+" ");
            }
         System.out.println();       
      }
    }
  }
}*/