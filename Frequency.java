//lowest number
import java.util.*;
class Frequency
  {
    public static void main(String args[])
    {
     int min=0;
     char ch='0';
      Scanner sc=new Scanner(System.in);
      String a;
      System.out.println("enter the String is ");
      int count=1;
      a=sc.nextLine();
      int n=a.length();
     boolean s1[]=new boolean[n];
 
      for(int i=0;i<n;i++)
        {
          s1[i]=false;
        }
         for(int i=0;i<n;i++)
          {
         if(s1[i]==true)
          continue;
            count=1;
            for(int j=i+1;j<n;j++)
                 {
                   if(a.charAt(i)==a.charAt(j))
                   {
                     count++;
                     s1[j]=true;
                   }
                 }
            System.out.println(" "+a.charAt(i)+"---->"+count);
     if(count<min)
          {
        min=count;
       ch=a.charAt(i);
         }              
              
    }
System.out.println("lowest frequency of the character is  "+ch+"---->"+min);
          
    
   }

}
//highest frequencyin string
/*import java.util.*;
class Frequency
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string ");
      String a=sc.nextLine();
      int count,max=0;char ch='0';
      int n=a.length();
      boolean str[]=new boolean[n];
      for(int i=0;i<n;i++)
        {
          str[i]=false;
        }   
      for(int i=0;i<a.length();i++)
        {
          count=1;
          
          if(str[i]==true)
            continue;
          for(int j=i+1;j<a.length();j++)
            {
              if(a.charAt(i)==a.charAt(j))
              {
                count++;
                str[j]=true;
              }
            }
          System.out.println(" "+a.charAt(i)+"---->"+count);
          if(max<count)
           {
     max=count;
     ch=a.charAt(i);
           } 
         }

          System.out.println("highest frequency of the character is "+ch+ "-------------"+max);
        
    }
  }*/

