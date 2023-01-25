class Shift{
  public static void main(String args[]){
    int x=25;
   System.out.println("the right shift is"+ (20>>5));
    System.out.println("the left shift is" + (50<<5));
    System.out.println("the right shift is"+ (60>>4));
    System.out.println("the left shift is" + (80<<2));
    System.out.println(x++ + --x);
    System.out.println(++x - --x);
    System.out.println(x++ + x++);
    System.out.println(++x + ++x);
    System.out.println(--x + --x);
  }
}