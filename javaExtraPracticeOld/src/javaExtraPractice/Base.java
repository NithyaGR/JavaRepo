package javaExtraPractice;

public class Base {

	public static void display()
	{
		System.out.println("DISPLAY - This is from Base class's static or class method ");
	}
	public static void display(String str){
		System.out.println("static display is overloaded in base class- "+str);
	}
	
	public void print()
	{
		System.out.println("PRINT -Instance method from Base");
	}
}
