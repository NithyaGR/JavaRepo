package javaPrograms;

public class ClassInterfaceC implements InterfaceA, InterfaceB, InterfaceC {
		
		public void printName(String name)//interface A method
		{
		     System.out.println("Your Name is "+ name);	
		}
		  public void printAge(int age)//interface A method
		  {
			   System.out.println("Your Age is "+ age); 
		  }
		  public void printStatment()//interface B method
		  
		  {
			  System.out.println("This is the code for the printStatement from InterfaceB ");
		  }
		  
          public void printCheck()// method of interface C class
          {
        	  System.out.println("This is from the classinterface which implements both interfaces A&B");
          }
          
          public void display(){
        	  System.out.println("This is from InterfaceC");
          }
	

	public static void main(String[] args) {
		

		InterfaceB obj = new ClassInterfaceC ();
		obj.printName("Nithya");
		obj.printAge(40);
		obj.printStatment();
	    System.out.println(InterfaceA.year);
	   // System.out.println("This is calling a non static variavle of an interface through object :"+obj.yearsInTotal);
	    InterfaceB object = new ClassInterfaceC();
	    object.printName("Kalyani");
	    object.printAge(41);
	    System.out.println("This is calling a non static variavle of an interface in a static way :"+InterfaceA.yearsInTotal);
		//obj.printCheck(); this won't work, which means, in Selenium structure, WebDriver class which implements 
		// all the interfaces don't have any new methods---- check
		
		
		ClassInterfaceC obj1 = new ClassInterfaceC();
		obj1.printCheck(); // All the above 4 methods can be called with this obj1.
		obj1.display();
		
		//obj.printCheck();
	}

}
