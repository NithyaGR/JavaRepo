package javaPrograms;

public class AbstractionPractice1 extends AbstractionPractice {
	
	public String abstractMethod()
	{
		System.out.println("Abstract Method");
		String name = "Krishna";
		return name;
	}
	
	public void abstractPrintMethod()
	{
		System.out.println("Abstract Print Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractionPractice1 obj = new AbstractionPractice1();
		System.out.println(obj.abstractMethod());
		obj.abstractPrintMethod();
		//obj.abstractDisplay(); Error as static methods should be handled in a static way
		obj.name = "Nithya";
		System.out.println(obj.name);
		AbstractionPractice obj1 = new AbstractionPractice1();
		System.out.println(obj1.abstractMethod());
		obj1.abstractPrintMethod();
		
		AbstractionPractice.abstractDisplay();
		
		

	}

}
