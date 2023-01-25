import java.util.Scanner;
class Switch
  {
    public static void main(String args[])
    {
     int option,num1,num2,num3;
      Scanner sc=new Scanner(System.in);
      System.out.println("******calculator********");
      System.out.println("1.addition");
      System.out.println("2.sub");
      System.out.println("3.divi");
      System.out.println("4.mul");
      System.out.println("5.%divi");
      System.out.println("entr option:");
      option=sc.nextInt();
      System.out.println("enter num1,num2 value");
      num1=sc.nextInt();
      num2=sc.nextInt();
      switch(option)
        {
          case 1:
            num3=num1+num2;
            System.out.println("the addition value is"+num3);
          break;
          case 2:
            num3=num1-num2;
            System.out.println("the subtract value"+num3);
          break;
          case 3:
            num3=num1/num2;
            System.out.println("the division value is"+num3);
            break;
          case 4:
            num3=num1*num2;
            System.out.println("the multiple value is"+num3);
          case 5:
            num3=num1%num2;
            System.out.println("the %division value is"+num3);
           break;
          default:
            System.out.println("the no value be executed");
        }
    }
  }