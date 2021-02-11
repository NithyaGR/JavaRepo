package javaExtraPractice;

public class Derived extends Base {
	
	public static void display()
	{
		//super.display(); error message
		System.out.println("Display -This is from Derived class's static or class method");
		
	}
	public static void display(String str){
		System.out.println(str+" static display - overridden of an overloaded method from Derived");
	}

	public void print()
	{
		//super.print();
		System.out.println("Print - This is from Derived Class's print method");
		
	}
	public void print(String name)
	{
		
		
		System.out.println("Print() - This is overloading of an overriden method print()from the Base");
	    System.out.println(name);
		
	}
	public void uniqueMethod(){
		System.out.println("This is a unique method from Derived");
	}
}
