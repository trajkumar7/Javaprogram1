// vowels and consonat
/*class Exam1
  {
    public static void main(String args[])
    {
      String a="Welcome bitlabs";
      int v_count=0,c_count=0;
      for(int i=0;i<a.length();i++)
        {
          if((a.charAt(i)=='a'|| a.charAt(i)=='e' || a.charAt(i)=='i' ||a.charAt(i)=='o' || a.charAt(i)=='u')&& ||a.charAt(i)=='A' || a.charAt(i)=='E' || a.charAt(i)=='I' || a.charAt(i)=='O' || a.charAt(i)=='U'))
          {
            v_count++;
          }
          else
         {
           c_count++;
         }
        }
      System.out.println("the vowels in the string is "+v_count);
       System.out.println("the consonents in the string is "+c_count);
    }
  }*/
/// mobile number using string
/*import java.util.*;
class Exam1{
  public static void main(String args[]){
    String mobilenum;
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter phone number (10 digits)");
   mobilenum = scanner.nextLine();
   
  
  if(mobilenum.length()==10){
      System.out.println("Your mobile number is correct;");
    }
    else{
      System.out.println("mobile number not correct:");
    }
  }
} */

/*import java.util.*;
class Exam1{
  public static void main(String args[]){
    String email;
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter the mail");
   email = scanner.nextLine();
       //System.out.println(email.contains("@")&&email.contains(".");
   if(email.contains("@")&&email.contains("."))
      {
         System.out.println("the mail is correct");
   }else
   {
         System.out.println("the mail is incorrect");
     }
   }
}  */
//WAP to count occurrences of a character in given string.
import java.util.*;
class Exam1{
  public static void main(String args[]){
    String s;int count=0;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the string");
   s=sc.nextLine();
    System.out.println("enter the which char you check");
    char ch=sc.next().charAt(0);
  for(int i=0;i<s.length();i++){
    if(ch==s.charAt(i)){
      System.out.println("count occurrences of a character"+ch+" in string possion"+i);
      count++;      
    }
  }
     System.out.println("count occurrences of a character in string"+count); 
  }
}  
 