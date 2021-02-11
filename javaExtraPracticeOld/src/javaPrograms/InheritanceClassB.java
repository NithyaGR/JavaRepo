package javaPrograms;

public class InheritanceClassB extends InheritanceClassA {

	public static void printNumber()
	{
		
	System.out.println("Second");
	
	for (int x=1; x<=4; x++)
	{
		for (int y=4; y>x; y--)
		{
			System.out.print(" ");
			//System.out.print(1);
			
		}
		for (int no1=1; no1<=x; no1++)
		{	
		System.out.print(" "+no1);
		
		}
		System.out.println();
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       printNumber();
	}

}
