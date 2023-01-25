class A{
  public synchronized void d1(B b){
    System.out.println("Thread is starting");
    try{
    Thread.sleep(2000);
  }
catch(InterruptedException e){
  e.printStackTrace();
}
 b.last();
}
public synchronized void last(){
  System.out.println("Thread d1 is start :");
}
}
class B{
  public synchronized  void d2(A a){
    System.out.println("Thread is starting");
    try{
    Thread.sleep(2000);
  }
catch(InterruptedException e){
  e.printStackTrace();
}
 a.last();
}
public  synchronized void last(){
  System.out.println("Thread d2() is start :");
}
}
public class Deadlock  extends Thread{
  A a=new A();
  B b=new B();
  public void m1(){
    this.start();
    a.d1(b);
  }
  public void run(){
    b.d2(a);
  }
  public static void main(String args[]){
    Deadlock t=new Deadlock();
    t.m1();
  }
}