package javaPrograms;

public class MathDebug {

	int num; 
	public void add(int i, int j){
		System.out.println("the sum is: "+(i+j));
	}
	
	public void product(int i, int j){
		System.out.println("the product is: "+i*j);
	}
	public static void main(String[] args) {
		
		int i = 5;
		int j = 10;
		System.out.println("The difference is :"+(j-i));
		
		MathDebug md = new MathDebug();
		md.add(i, j);
		md.product(i, j);

	}

}
