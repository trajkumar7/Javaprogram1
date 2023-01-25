/*   JFM1T12_Assignment5:

     Write a program to build any collection containing duplicates. Create its copy with all duplicates removed. 
     Prompt the user input from the terminal.
     
     Sample Input:
     Enter how many numbers you want: 
     4
     Enter Number 0
     4
     Enter Number 1
     3
     Enter Number 2
      3
     Enter Number 3
     4
     
     Expected Output:
     After removing duplicates: [4, 3]
*/     

import java.util.*; 
import java.util.ArrayList; 

class Duplicate  { 

//main method
public static void main(String args[]){
//create Scanner object 
Scanner sc=new Scanner(System.in);
  System.out.println("Enter how many numbers you want: ");
  int size=sc.nextInt();
//take input from user
  
ArrayList<Integer> al=new ArrayList<>();
  for(int i=0;i<size;i++){
    System.out.println("Enter Number: "+(0+i));
    al.add(sc.nextInt());
  }
//creat an object of LinkedHashSet class 
  Set<Integer> al1=new LinkedHashSet<>(al);
//creat an object of ArrayList class and pass LinkedHashSet object
/*for (int i=0;i<al1.size();i++){
  System.out.println(al1.get(i));
}*/
  System.out.println("After removing duplicates:"+al1);
//Print result
}
}