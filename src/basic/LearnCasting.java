package basic;

public class LearnCasting {
	//casting:casting means converting data type
	//primitive datatype to primitive datatype
	//Nonprimitive to non peimitive 
	public static void main(String[] args) {
		double price=35.99;
		int discountePrice= (int) price; //convert primitiv to primitiv datatype
		System.out.println(discountePrice);
		
		int age=24;
		double newAge=(double) age;
		System.out.println(newAge);
		
		int number=24;
		byte total=(byte)number;// this is call casting
		System.out.println("int to byte "+total);
		
		String name="ghania";
		String stName= (String)name;// this is a non primitive to nn primitive.the name already string so we dont 
		//need to do casting
		
		String ssn="1234";
		int newSsn=Integer.parseInt(ssn);
		System.out.println(newSsn);
		int newSsn1=Integer.valueOf(ssn);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
