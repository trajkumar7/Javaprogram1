//package aarogya_hospital;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;

// the main class
public class AarogyaHospital{
 static int count=100;
	
        // class for storing the patient information
	class AarogyaMember{
    String name,gender,city,address,dateOfAdmission,guardian_name,guardian_address;
      int id,age; 
  long AadharCardnumber,contactNumber,guardianContactNumber;
    // declare all the details for the patient including name, age, gender, Aadhar Card number, contact number, city, address, date of admission, guardian name, guardian address, guardian contact number
	
	    // make constructor for the class and assign it a unique Id
	    public AarogyaMember(){
	    	count++;
        id=count;
	    }
    	    // for taking patient information
	    public void input(){
	    	Scanner sc=new Scanner(System.in);
         System.out.println("Patient Informantion: ");
        System.out.println("Enter the name of the patient: ");
        name=sc.nextLine();
        System.out.println("Enter the age of the patient: ");
        age=sc.nextInt();
        System.out.println("Enter the Gender of the patient: ");
        gender=sc.next();
        System.out.println("Enter the aadhar number of the patient: ");
        AadharCardnumber=sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the date of admission of the patient: ");
        dateOfAdmission=sc.nextLine();
        System.out.println("Enter the contact number of the patient: ");
        contactNumber=sc.nextLong();
        System.out.println("Enter the city of the patient: ");
        city=sc.next();        
        System.out.println("Enter the address of the patient: ");
        address=sc.next();
        System.out.println();
        System.out.println("Guardian Information: ");
        System.out.println("Enter the guardian name of the patient: ");
        guardian_name=sc.next();
        System.out.println("Enter the guardian address of the patient: ");
        guardian_address=sc.next();
        System.out.println("Enter the guardian number of the patient: ");
        guardianContactNumber=sc.nextLong();
       // System.out.println();
	    }
	      
	}
  static void display(AarogyaHospital.AarogyaMember patient){
    System.out.println("Patient details are:");
   System.out.println("Patient Id  are :"+patient.id);
    System.out.println("Patient name  is :"+patient.name);
   System.out.println(" Patient age : "+patient.age); 
    System.out.println(" Patient gender : "+patient.gender);
    System.out.println("Patient Aadhar Number :"+patient.AadharCardnumber);
    System.out.println("Patient contact number :"+patient.contactNumber);
    System.out.println("Patient city :"+patient.city);
    System.out.println("Patient address is :"+patient.address);
System.out.println("Patient date of admission is ;"+patient.dateOfAdmission);
    System.out.println("Guardian detais");
    System.out.println("Patient guardian name"+patient.guardian_name); System.out.println("Patient guardian address :"+patient.guardian_address);
System.out.println("Patient guardian name"+patient.guardianContactNumber); 
  }

	// pick the choice of task to be performed
	static long choices(){
		System.out.println("Press 1 for adding new member");
		System.out.println("Press 2 to view list of all available members");
		System.out.println("Press 3 to search member by ID");
		System.out.println("Press 4 to search member from a particular city");
		System.out.println("Press 5 to search member from a particular age group");
		System.out.println("Press 6 to mark recovery of a member");
		System.out.println("Press 7 to delete data of a member");
		System.out.println("Press 0 to exit");
		
            // create scanner class to take input
    System.out.println("Chose the option b/w 0-7 you want :");
    Scanner ip=new Scanner(System.in);
	    long option=ip.nextLong();
	    return option;
	}

	public static void main(String args[]){
		
		// initialise array list to store list of patients information
		Scanner sc=new Scanner(System.in);
    AarogyaHospital ah=new AarogyaHospital();
    ArrayList<AarogyaMember> al=new ArrayList<AarogyaMember>();
		//for adding aarogya member information
    Iterator <AarogyaMember> it= al.iterator();
    boolean found;
		while(true){

			//take choice
			long option=choices();
			
			//invalid choice
			if(option<0||option>7){
			System.out.println("Invalid taken the number :");
			}
			// take the input and add in the arrayList
			else if(option==1){
	           AarogyaHospital.AarogyaMember am=ah.new AarogyaMember();
        am.input();
        al.add(am);
        	        }
			//iterate and print all the patients information
	       		 else if(option==2){
	            it= al.iterator();
             while (it.hasNext()) {
            AarogyaHospital.AarogyaMember a=it.next();
               display(a);
                }
    		 }
			
			// print details of the patient with a particular id (take id as input)
	                else if(option==3){
	                     found=false;
                    System.out.println("Enter the id number to such :");
                   int id=sc.nextInt();
                    it= al.iterator();
                    while (it.hasNext()) {
            AarogyaHospital.AarogyaMember a1=it.next();
                      if(a1.id==id){
                        display(a1);
                        found=true;
                      }
                    }
               if(found==false){
                 System.out.println("No Patient in the number ");
               }
                }
	                
			
			// to print all the patients from a particular city (take city as input)
	                else if(option==4){
                    found=false;
	        	       System.out.println("Enter the city name to such :");
                    String city=sc.next();
                    it= al.iterator();
                    while (it.hasNext()) {
                    AarogyaHospital.AarogyaMember a2=it.next();
                      if(a2.city.equals(city)){
                        display(a2);
                        found=true;
                      }
                    }
               if(found==false){
                 System.out.println("No Patient in that city name");
               }
	               }
                  
			// to print details of all the patients in a particular age group (take age limits as input)
	               else if(option==5){
	               found=false;
                   System.out.println("Enter the age group to such :");
                   int age=sc.nextInt();
                   it=al.iterator();
                   while (it.hasNext()){
                    AarogyaHospital.AarogyaMember a3=it.next();
                     if (a3.age==age){
                        display(a3);
                        found=true;
                     }
                   }
                     if(found==false){
                      System.out.println("No Patient in the age group"); 
                     }
                 }
	              
	              // take member id as input to maintain recovered information of patient
	               else if(option==6){
	            boolean recovered=false;
      System.out.println("Enter the id to sunch recovered patient:"); 
                   int id=sc.nextInt();
                   it=al.iterator();
                   while(it.hasNext()){
                    AarogyaHospital.AarogyaMember a4=it.next();
                     if(a4.id==id){
                       display(a4);
                       recovered=true;
                        System.out.println("Patient is recovered"+id); 
                     }
                   }
                    if(recovered==false){
                      System.out.println("There is no Patient recovered  in the "+id); 
                     }
	              }
	              //take member id as input to delete patient information
	              else if(option==7){
			          System.out.println("Enter the Patient id to delete ");
                  int id=sc.nextInt();
                  it=al.iterator();
                  while(it.hasNext()){
                AarogyaHospital.AarogyaMember a5=it.next();
                    if(a5.id==id){
                      it.remove();
                    }
                  }
                  
	              }
			
	              else{
	             break;
	             }
		}
	}
}
