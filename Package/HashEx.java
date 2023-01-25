import java.util.*;
class HashEx
  {
    public static void main(String args[])
    {
      HashSet<Integer> hs=new HashSet<Integer>();
      hs.add(56);
      hs.add(78);//It doesnot follow insertion order
      hs.add(12); //It accepts unique value
      hs.add(34);
      hs.add(89);
      hs.add(56);
      hs.add(null);
      hs.add(null); //It allows only atmost one null value to store
      System.out.println(hs);
      LinkedList<Integer> ll=new LinkedList<Integer>(hs);
      System.out.println(ll);
    }
  }