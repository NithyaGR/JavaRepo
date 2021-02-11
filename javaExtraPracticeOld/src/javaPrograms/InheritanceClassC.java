package javaPrograms;

public class InheritanceClassC extends InheritanceClassB {
    
	public static void print()
	{
		System.out.println("First");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//InheritanceClassC object1 = new InheritanceClassC();
		
		//InheritanceClassA obj = new InheritanceClassC();
		InheritanceClassA.isPrime(37);//you can call only A's methods.
		
		
		//InheritanceClassB obj1 = new InheritanceClassC();
		InheritanceClassB.isPrime(47);//you can call only A and B's methods
		InheritanceClassB.printNumber();
		
		
		
//		object1.print();
//		
//		object1.printNumber();//As it's a static method, I could call. 
//		
//		object1.isPrime(29);//you can all A, B, and C's methods
		
		/*InheritanceClassC object2 = (InheritanceClassC) new InheritanceClassA();
		object2.isPrime(25);
		object2.printNumber();
		object2.print();
*/
	}

}
