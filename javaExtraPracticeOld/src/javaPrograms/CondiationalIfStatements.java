package javaPrograms;
import java.util.Scanner;

public class CondiationalIfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		number = scan.nextInt();
		
		if (number<0)
		{
			System.out.println("You have entered a negative number");
		} 
		else if (number%2==0)
		{
			System.out.println("You have entered an even number");
			
		}
		else if (number%2==1)
		{
			System.out.println("You have entered an odd number");
		}
		//System.out.println(Math.sqrt(number));
		
		if ((number%2==0)&&(number%3==0))
				{
			System.out.println("Number is divisible by 6");
				}
		
		/*for (int i = 2; i < Math.sqrt(number); ++i) {  
	           if (number % i == 0) {  
	               System.out.println("Not Prime"); 
	           }  
	           //System.out.println("Done with For loop");
	       }  */
		/*else if ((number%5==0))
		{
			System.out.println("Number is divisible by 5");
			
		}
		else if (number%7==0)
		{
			System.out.println("Number is divisble by 7");
		}
		else if (number%9==0)
		{
			System.out.println("Number is divisible by 9");
		}
		else if ((number%11==0)||(number%13==0)||(number%17==0)||(number%19==0))
		{
			System.out.println("Not a prime");
		}
		else
		{
			System.out.println("Your number is a prime number");
		}*/
		scan.close();
	}

}
