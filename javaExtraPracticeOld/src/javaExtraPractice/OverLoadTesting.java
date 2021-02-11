package javaExtraPractice;

public class OverLoadTesting {
	
	//WE CAN NOT OVERLOAD WITH DIFFERNT RETURN DATA TYPES ALONE
	/* public int foo() { return 10; } 
	  
	    // compiler error: foo() is already defined 
	    public char foo() { return 'a';}*/

	// BUT BELOW IS POSSIBLE AS THERE ARE 2 DIFFERNT NUMBER OF PARAMETERS
	
	public static int foo(int a) { return 10; } 
    public static char foo(int a, int b) { return 'a'; } 
    
    public static void main(String arg1) 
    { 
        System.out.println("Hi, " + arg1); 
        OverLoadTesting.main("Dear Krishna", "My Krishna"); 
    } 
    public static void main(String arg1, String arg2) 
    { 
        System.out.println("Hi, " + arg1 + ", " + arg2); 
    } 
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(foo(5));
		System.out.println(foo(1,2));
		System.out.println("Hi from Main");
		 OverLoadTesting.main("Krishna");  
		  
		   
	}

}
