package basic;

import java.util.Scanner;

public class LearnScanner {
	
	
	public static void main(String[] args) {
		//class name is scanner
		//how to create an object of scanner class?
		
		//className objectname=new conconstration
		
		
      Scanner input = new Scanner(System.in); 
      //create a scanner object
      //system.in is give the input from cumptur to scanner class
      System.out.println("Enter your first name");
      String firstName=input.nextLine();
      System.out.println("first Name : "+firstName);
      
      System.out.println("Enter your last name");
      String lastName=input.nextLine();
      System.out.println("last Name : "+firstName);
      System.out.println("Full Name : "+firstName+" "+lastName);
      
     System.out.println("Enter courses fee");
     double cFee=input.nextDouble();
     System.out.println("Course fee is "+cFee);
     System.out.println("Enter your age ");
     int age=input.nextInt();//read the integer value from the standar value
     System.out.println("My Age is "+age);
      
      
      
      // after you done by using Scanner you should close the Scanner
      //temperature=stdin.nextDouble;
      
      
      
      
      
      
	}
	
	
	
	
	
	
	
	
	
}
