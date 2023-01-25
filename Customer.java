//by using instance variable 
/*class Customer{
 String name; int id;  String addres;
  public static void main(String args[]){
    Customer cu=new Customer();
    cu.name="raju"; cu.id=124; cu.addres="Nuzvid";
    System.out.println("name:"+cu.name+" "+"id"+cu.id+" "+"address"+cu.addres);
  }
}*/
//by non static using method
/*Customer{
  String name; int id; String addres;
  public void insertRecord(String coustname, int coumstid, String coustaddress){
    name=coustname; id=coumstid; addres=coustaddress;
  }
  public void display(){
    System.out.println("name is:"+name+" "+"id is:"+id+" "+"adress is:"+addres);
  }
  public static void main(String []args){
    Customer cu=new Customer();
    cu.insertRecord("raj",124,"nuzvid");
    cu.display();
  }
}*/
/*class Customer{
    String name; int id; String addres;
    public void insertRecord(String custname, int custid, String coustaddres){
        name=custname; id=custid; addres=coustaddres;
    }
    public void display(){
        System.out.println(name+" "+id+" "+addres);
    }
    public static void main(String args[]){
        Customer cu=new Customer();
        cu.insertRecord("raj",124,"Nuzvid");
        cu.display();
    }
}*/
//by using array abject
/*import java.util.*;
class Customer{
String name; int id; String address; 
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Customer em[]=new Customer[3];
    for(int i=0;i<3;i++){
        em[i]=new Customer();
        System.out.println("enter the name");
        em[i].name=sc.next();
        System.out.println("enter the id");
        em[i].id=sc.nextInt();
        System.out.println("enter the designation");
        em[i].address=sc.next();        
    }System.out.println("the employ details are");
        
    for (int i=0;i<3;i++){
        System.out.println("name is:"+em[i].name+" "+"id"+em[i].id+" "+"designation"+" "+em[i].address);
        
    }
}
}*/
//parameterize constructor
import java.util.*;
class Customer
  {
    Customer(String cname,int id)
    {
      System.out.println("name="+cname+" "+"id="+" "+id);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter name");
      String name=sc.next();
      System.out.println("enter id no");
      int cid=sc.nextInt();
      Customer st=new Customer(name,cid);
    }
  }   

//to convert primitive datatype to object
class WrapperClassEx
  {
    public static void main(String args[])
    {
      int a=20;
      Integer i=Integer.valueOf(a); //autoboxing
      System.out.println("the value of i is:"+i);
      Integer j=a;
      System.out.println(a);
    }
  }

    class WrapperClassEx
  {
    public static void main(String args[])
    {
      Integer a=Integer.valueOf(23);
       int i=a.intValue();
      System.out.println("the value of i is:"+i);
      int j=a;
      System.out.println("the value of j is:"+j);
    }
  }
