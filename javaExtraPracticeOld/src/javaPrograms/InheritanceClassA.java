package javaPrograms;

public class InheritanceClassA {

	public static void isPrime(int num)
	{
		System.out.println("Third");
		if ((num == 2)|| (num ==1))
		{
			System.out.println(num + "is a prime number");
		}
		for(int i=2; i < Math.sqrt(num); i++)
		{
			if(num%i ==0)
			{
				System.out.println(num + "is not a prime number");
			}
			else 
			{
				System.out.println(num + "is a prime number");
				break;
			}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            isPrime(29);
	}

}
