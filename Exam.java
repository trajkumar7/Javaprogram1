//string is a java class to stroe the group of charectrs
//it can be alphabet or special charecter 
// is immutable 
// it can be write as a 
//fine the length of string
/*class Exam{
  public static void main(String args[]){
    String s="raj";
    String s1="kumar";
    System.out.println("lenth of string is"+s1.length());
  }  
}*/
// cha='a'; but in string to char convert 
/*class Exam{
  public static void main(String args[]){
    String s1="kumar";
      /* for(int i=0;i<s1.length();i++)
        {  
            System.out.println(s1.charAt(i));
        }
    System.out.println(s1.charAt(4));
  }
} */
// compareTo-- elemts in or not
/*class Exam{
  public static void main(String args[]){
    String s="kumar";
    String s1="raj";
    String s2="welcome";
     String s3="apple";
   System.out.println(s1.compareTo(s1));// both are eql=0
   System.out.println(s.compareTo(s1));//s>s1= print=-value
   System.out.println(s.compareTo(s3));//s<s1= print=+value
     System.out.println(s.concat(s3));
  }
} */
//concat-- adding the two
/*class Exam{
  public static void main(String args[]){
    String s="kumar";
    String s1=" raj ";
    String s3="kumar";
    System.out.println(s1.concat(s));
    System.out.println(s1.equalsIgnoreCase(s3));
    System.out.println(s.equals(s3));
    System.out.println(s==s3);
    System.out.println(s1.trim());
  }
}*/
//split() // totak=l string is convert to another string
/*class Exam
  {
    public static void main(String args[])
    {
    String s1="welcome to bit labs";
    String s[]=s1.split(" ");
    for(int i=0;i<s.length;i++)
      {
        System.out.println(s[i]);
      }
    }
  } */
/*class Exam
  {
    public static void main(String args[])
    {
    String s1="welcome";
    char ch[]=s1.toCharArray();
     for(int i=0;i<ch.length;i++)
       {
         System.out.println(ch[i]);
       }  
    }
  }*/
///WAP to find length of a string and compare and concatenate two strings.
//WAP to find total number of alphabets, digits or special character in a string.
/*66. WAP to count total number of vowels and consonants in a string.
67. WAP to count total number of words in a string.
68. WAP to find reverse of a string.
  WAP to find first occurrence of a character in a given string.
71. WAP to find last occurrence of a character in a given string.
class Exam{
  public static void main(String args[]){
    String s="welcome to program";
    String s1="raj";
    System.out.println("lenth of string is"+s.length());
    System.out.println(s.compareTo(s1));//w>r//5 
    System.out.println(s.concat(s1)); //adding  
    System.out.println(s.endsWith("m"));
    System.out.println(s.startsWith("me"));
    int index=s.indexOf("welcome");
    int index1=s.indexOf("program");
      System.out.println("index value of first occurance of the character:"+index);
    System.out.println("index value of last occurance of the character:"+index1);
    //if(s==s1)
    
  }
}*/
/*class Exam
  {
    public static void main(String args[])
    {
      String str="Hello@123";
      int acount=0,dcount=0,scount=0;
      for(int i=0;i<str.length();i++)
        {
          if((str.charAt(i)>='a'&& str.charAt(i)<='z') || (str.charAt(i)>='A'&& str.charAt(i)<='Z'))
          {
            acount++;
          }
        
      else if(str.charAt(i)>='0'&& str.charAt(i)<='9')
      {
        dcount++;
      }
      else{
        scount++;
      }
        }
      System.out.println("alphabets count in the give string is :"+acount);
      System.out.println("Digits count in the give string is :"+dcount);
      System.out.println("special characters count in the give string is :"+scount);
   }
    
  }*///join()
/*class Exam
  {
    public static void main(String args[])
    {
    String s=String.join("/","21","12","2022");
      System.out.println(s);
    }
  }*/
//toString()
/*class Exam
  {
    public static void main(String args[])
    {
    int x=123;
    String s=Integer.toString(x);
    System.out.println(s);
      
    }
  }*/
import java.util.*;
class Exam
  {
    public static void main(String args[])
    {
      int count=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string to search for all occurances");
      String s=sc.nextLine();
      System.out.println("enter the character to search");
      char ch=sc.next().charAt(0);
      for(int i=0;i<s.length();i++)
        {
          if(ch==s.charAt(i))
          {
            System.out.println("Given character "+ch+" is at position: "+i);
            count++;
          }
          }
      System.out.println("count of the character is :"+count);
    }
  }