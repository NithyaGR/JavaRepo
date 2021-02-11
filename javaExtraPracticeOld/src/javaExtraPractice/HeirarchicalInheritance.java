package javaExtraPractice;

public class HeirarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassA objA = new ClassA();
		ClassB objB = new ClassB();
		ClassC objC = new ClassC();
		ClassD objD = new ClassD();
		objA.printA();
		objB.printB();
		objB.printA();
		objC.printC();
		objC.printA();
		objD.printD();
		objD.printA();
	}

}
