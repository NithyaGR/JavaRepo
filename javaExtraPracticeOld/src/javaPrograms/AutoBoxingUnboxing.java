package javaPrograms;

public class AutoBoxingUnboxing {

	public static void main(String[] args) {
	
		int i = 55;
		Integer intObject = new Integer(i);
		System.out.println(intObject);// converting primitive dt i into an Integer obj
		
		int j = intObject;
		System.out.println(j);//converting Integer object into an int data type
		
		

	}

}
