package javaPrograms;
//import java.util.Scanner;



public class VariablesAndDataTypes {
	
	static String st = "This is a static variable - No need to create an object";//Static Variable or global variable
	static String st1;
	String InstanceVariable ="This is an instance Variable - You need an object to access";//Object specific 
	String InstanceVariable1;
	int i;
	byte b;
	short s;
	long l;
	float f;
	double d;
	char c;
	boolean bo;
	public void testLocalVariabel(){
		//int i;
		//int j;
		//System.out.println(i);
		System.out.println(b);
		
	}
	public void ExampleLocalVariable(){
	int var = 10;
	String LocalVariable = "This is a local variable inside a method";
	System.out.println(var);
	System.out.println(LocalVariable);
	System.out.println(st1);
	System.out.println(b);
	System.out.println(s);
	System.out.println(i);
	System.out.println(l);
	System.out.println(f);
	System.out.println(d);
	System.out.println(c);
	System.out.println(bo);
	System.out.println(InstanceVariable1);
	
	}
	public void getValue(String j){
		System.out.println(j);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Example of Local variables
		char initial = 'W';
		//boolean check;
		VariablesAndDataTypes Obj1 = new VariablesAndDataTypes();
		System.out.println(Obj1.InstanceVariable);
		System.out.println(st);
		System.out.println(Obj1.b);
		System.out.println(Obj1.s);
		System.out.println(Obj1.i);
		System.out.println(Obj1.l);
		System.out.println(Obj1.f);
		System.out.println(Obj1.d);
		System.out.println(Obj1.c);
		System.out.println(Obj1.bo);
		Obj1.ExampleLocalVariable();
		System.out.println(initial);
		st1 = "We can declare later in main method - a static variable";
		System.out.println(st1);
		Obj1.InstanceVariable1 = "We can declare later in main method - an instance variable";
		System.out.println(Obj1.InstanceVariable1);
		Obj1.getValue(Obj1.InstanceVariable1);
		//System.out.println(check);You can not just declare any local variables without defining it 
		
		/*int i;
		System.out.println(i);
		byte b;
		System.out.println(b);
		short s;
		System.out.println(s);
		long l;
		System.out.println(l);*/
		
		
		//Obj1.ExampleLocalVariable();
		//boolean availability = true;
		
		/*Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		String Name = scan.next();
		System.out.print("Your Name is "+Name);
		System.out.println("");
		
        System.out.print("Enter your Age: ");
        
        int age = scan.nextInt();
        System.out.print("Your Age is "+age);
        System.out.println("");
        
        
       System.out.println("Enter your Height: ");
        float height = scan.nextFloat();
        System.out.print("Your Height is "+height);
        System.out.println("");
        
        System.out.println(st);
        System.out.println("");
        
        System.out.println("Enter your Weight: ");
        Double weight = scan.nextDouble();
        System.out.print("Your Weight is "+weight);
        
        
        scan.close();*/
        
        
        
     
        
		
	}

}
