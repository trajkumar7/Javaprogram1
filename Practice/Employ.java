/*display the employ names by using 
class Employ{
  String name;
  int salary;
  int id;
  String designation;
  public static void main(String args[]){
    Employ em=new Employ();
    Employ em1=new Employ();
    Employ em2=new Employ();
    em.name="raj"; em.salary=120000; em.designation="account"; em.id=124;
    em1.name="durga"; em1.salary=140000; em1.designation="developer"; em.id=114;
    em2.name="anudeep"; em2.salary=150000; em.designation="Po"; em.id=110;
    System.out.println(em.name+"id="+em.id+"salary="+em.salary+"designation is "+em.designation);
    System.out.println(em1.name+" "+em.id+" "+em1.salary+" "+em1.designation);
    System.out.println(em2.name+" "+em.id+" "+em2.salary+" "+em2.designation);
  }
}
//employ names by using aruguments
class Employ{
  String name;
  int id;
  int salary;
  String designation;
  public void insertRecord(String empname, int empid, int emplysly,String ocup){
    name=empname; id=empid; salary=emplysly; designation=ocup;    
  }
  public void display(){
     System.out.println(name+" "+id + " "+salary+ " "+designation);
  }
  public static void main(String args[]){
    Employ em=new Employ();
    em.insertRecord("raj", 124, 12000,"account");
    em.display();
  }
}*/
import java.util.*;
class Employ{
  String name;
  int id; int salary; String designation;
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Employ em[]=new Employ[4];
    for(int i=0;i<4;i++){
      em[i]=new Employ();
      System.out.println("enter the employe name:");
      em[i].name=sc.next();
       System.out.println("enter the employe Id:");
      em[i].id=sc.nextInt();
       System.out.println("enter the employe salary:");
      em[i].salary=sc.nextInt();
       System.out.println("enter the employe designation:");
      em[i].designation=sc.next();      
    }
    System.out.println("the employ details is;");
    for (int i=0;i<4;i++){
      System.out.println(em[i].name+" "+ "Id" + em[i].id+" "+ "salary"+ em[i].salary+" "+ "designation is"+" "+""+ em[i].designation);
    }
  }
}






















