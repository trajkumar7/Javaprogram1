/*import java.util.*;
public class ArrayListEx
  {
    public static void main(String args[])
    {
      ArrayList <Integer> al=new ArrayList <Integer>();
      al.add(34);
      al.add(31);
      al.add(87);
      al.add(45);
      al.add(46);
      System.out.println(al);
     System.out.println(al.set(0,87));
      System.out.println(al.get(3));
      System.out.println(al.size());
    }
  }*/
import java.util.*;
class ArrayListEx1
  {
    public static void main(String args[])
    {
      ArrayList al=new ArrayList();
      al.add("eggs");
      al.add(12);
      al.add(42.8f);
      al.add('M');
      al.add(786.24);
      System.out.println(al);
      System.out.println(al.size());
      System.out.println(al.get(4));
      System.out.println(al.set(1,14));
      System.out.println(al);
    }
  }