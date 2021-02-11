package javaPrograms;

interface InterfaceB extends InterfaceA, InterfaceC

{
	public void printStatment();
	public static void checking(){
		System.out.println("static methods are allowed in the interface- it requires a body");
	}
}
