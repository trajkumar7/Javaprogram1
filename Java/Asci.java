import java.util.Scanner;

class Asci {
  public static void main(String args[]){
        Scanner scanner = new Scanner(System.in); 
        System.out.println("enter the character");
        char character = scanner.next().charAt(0);  
        int asciiValue = character; 
       System.out.println(asciiValue);

  }  
}