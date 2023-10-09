package org.sample;
//class1
public class Alldetails extends InheritBank{
//class1 method1
	public void nameAge(String name, int age ) {

		System.out.println("coustomer name is : " +name + " coustomer age is : "+age);
		
	}
	 
	public static void main(String[] args) {
	Alldetails bank= new Alldetails();
	bank.nameAge("sathish", 32);
	bank.contact(701051539l);
	bank.location("chennai");
	}
	
}



//class 2
class InheritBank extends Bankdetails{
	//class2 method1
	public void contact(long contact) {
System.out.println("coustomer contat number is : "+contact);
	}
	
}


// class 3
class Bankdetails{
	//class3 method1
	public void location(String location) {
System.out.println("coustomer location is : "+location);
	}
	
	
}