
package javaPrograms;



public class MethodAndObject {
	
	       static String st;
	       String st1;
	       int num;
			public int Methods(int _value) {
		   // System.out.println("Constructor method is called when an object of it's class is created");
		    int var1 = 10;
		    //int var2 = 20;
		    int var3 = var1+_value;
		    return var3;
	       
		  }
		
		// Static method
		 
		  static void staticMethod() {
			  st = "Static method can be called without creating an object";
			  
		    System.out.println(st);
		  }
		 
		  // Non static method
		 
		  void nonStaticMethod() {
			  st1 = "Non static method must be called by creating an object";
		    System.out.println(st1);
		  }
		 
		  // Main method where program execution begins
		 
		  public static void main(String[] args) {
			/*int var4;
			Scanner scan = new Scanner(System.in);
	        System.out.print("Enter a number: ");

	        // This method reads the number provided using keyboard
	        int num1 = scan.nextInt();
	        System.out.print("Enter another number: ");
	        int num2 = scan.nextInt();
	        int num3;
	        num3 = num1+num2;
	        
	        // Closing Scanner after the use
	        scan.close(); */
	       
		    MethodAndObject object = new MethodAndObject();
		    object.nonStaticMethod();
		    staticMethod();
		    //System.out.println(object.st1);
		    /*MethodAndObject object1 = new MethodAndObject();
		    		object1.Methods(num1);
		    		System.out.println(object1.Methods(num1));
		    		System.out.println(object1.Methods(num2));
		    		var4 = object.Methods(num3)/2;//We can consider or treat object.Methods(num3) as an integer as it reurns integer
		    		
		    		System.out.println(object.Methods(num3)/2);*/
		    		
		    		
		    		
		  }
		 
		  
	
}
