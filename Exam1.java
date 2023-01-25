/*class MyThread extends Thread{
  public void run(){
    for (int i=0;i<10;i++){
      System.out.println("child Thread");
    }
  }
}
public class Exam1{
  public static void main(String[]args){
    MyThread t=new MyThread();
    t.start();
    for(int i=0;i<10;i++){
      System.out.println("main Thread");
    }
  }
}*//*
class MyRunnable implements Runnable{
  public void run(){
    for (int i=0;i<10;i++){
      System.out.println("child Thread");
    }
  }
}
public class Exam1{
  public static void main(String[]args){
   MyRunnable mr=new MyRunnable();
   Thread t=new Thread(mr);
    t.start();
    for(int i=0;i<10;i++){
      System.out.println("main Thread");
    }
  }
}
*/
import java.util.*;
class MyThread extends Thread{
  int a[];  
  MyThread(int ar[]){
    a=ar;
    start();
  }
  public void run(){
    Arrays.sort(a);
    System.out.println("child sorting");
  }
}
public class Exam1{
public static void main (String args[])throws Exception{
  int b[]={4,6,2,0,8,9,10};
  MyThread t=new MyThread(b);
  t.join();
  //Sytsem.out.println("main printing array elements:");
  for(int i=0;i<b.length;i++){
    System.out.println(b[i]);
  }
}
}