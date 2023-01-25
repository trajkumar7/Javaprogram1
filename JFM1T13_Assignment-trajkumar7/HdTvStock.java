/*  JFM1T13_Assignment4: 

      Write a program to create a class HDTV with the properties: 
         •	Brandname 
         •	Size 
      Create another class having an ArrayList and add 3 objects of HDTV into it. Display HDTV objects in sorted order of size.(Use Comparator) 

     Sample Output:
     4000 Sony 20
     2000 LG 26
     3000 MI 27
     1000 Samsung 28
*/
import java.util.*;
class HdTv{
//main method
int size;  int price;
String brandname;  
//Product class constructor  
public HdTv(int size, String brandname, int price )  
{  
this.size= size;  this.price=price;
this.brandname =brandname;  
}
}
class sortSize implements Comparator<HdTv>{
  public int compare(HdTv o1,HdTv o2){
  return o1.size-o2.size;
  }
}
public class HdTvStock  {
//create HdTv class object in arraylist
public static void main(String args[])  
{  
//add elements to that arraylist
      ArrayList<HdTv> al=new ArrayList<HdTv>();
//print values on sorted order based on size value
 HdTv obj1=new HdTv(20,"Sony",4000);
  HdTv obj2=new HdTv(26,"LG",5000);
  HdTv obj3=new HdTv(50,"MI",8000);
  HdTv obj4=new HdTv(10," Samsung ",1000);
  al.add(obj1);
  al.add(obj2);
  al.add(obj3);
  al.add(obj4);
  Collections.sort(al,new sortSize());
  Iterator <HdTv> itr=al.iterator();
 while(itr.hasNext()){
   HdTv obj=itr.next();
   System.out.println(obj.size+" "+obj.price+" "+obj.brandname);
 }
  System.out.println(al);  
}
}
//use collection.sort and pass Brandname Comparator as parameters

//print result

//create HdTv class in that declare variables and pass variables as parameters


//create BrandnameComparator it implements Comparator in that create a compare method pass two parameters for comparing sizes

//access HdTv class objects

//compare sizes and return size

