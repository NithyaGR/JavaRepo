package b;

import a.*;

public class C extends A{
	
	public static void main(String[] args) {
		
		C objC = new C();
		System.out.println(objC.l);//l is public
		System.out.println(objC.k);
		
		System.out.println(objC.hashCode());
	}
	
	

}
