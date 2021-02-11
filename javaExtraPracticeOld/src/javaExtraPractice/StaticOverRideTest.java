package javaExtraPractice;

public class StaticOverRideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Base base = new Derived();
		//The following two will call the base class method only as staic methods cann't be overridden
		//base.display();//static method should be addressed in a static way
		//base.display("Nithya");
		Base.display();
		Derived.display();
		base.print();
		Derived der = (Derived) base;//downcasting
	    if (der instanceof Base){
	    	System.out.println("der is an instance of Base");
	    	System.out.println(base);
	    }
	    if (der instanceof Derived){
	    	System.out.println("der is an instance of Derived");
	    	System.out.println(der);
	    }
	    der.uniqueMethod();
	
	    Derived derived = new Derived();
		derived.print();
		String name = "Nithya";
		derived.print(name);
		//upcasting 
		Base base1 = (Base) derived;
		System.out.println(base1);
		System.out.println(derived);
		
		
		/*Check the below codes for static overriding
		
		Base object3 = new Derived();
		object3.display();
		object3.print();
		Derived obj = new Derived();
		obj.display();*/

	}

}
