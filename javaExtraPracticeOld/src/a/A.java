package a;



public class A {
	int i = 10;
	private int j = 20;
	protected int k = 30;
	public int l = 40;
	
	public static void main(String[] args) {
		
	A objA = new A();
	System.out.println(objA.i);
	System.out.println(objA.j);
	System.out.println(objA.k);
	System.out.println(objA.l);
	System.out.println(objA.hashCode());

		
	}

}
