package javaPrograms;

interface InterfaceA {

	
		  static int year=2015;
		  int yearsInTotal = 5;//default this is static - but can be accessed in a non static way though it shows an error message
		  
		  public void printName(String name); // interface method (does not have a body)
		  public static void check(){
			  System.out.println("Static Methods are allowed in the interface");
		  }
		  public void printAge(int age); // interface method (does not have a body)
		}

	
