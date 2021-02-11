package javaExtraPractice;
import java.util.Scanner;

public class SeleniumJavaSampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /* This reads the input provided by user
         * using keyboard
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();
        System.out.print("Enter another number: ");
        int num1 = scan.nextInt();
        int num2;
        num2 = num+num1;
        
        // Closing Scanner after the use
        scan.close();
        
        // Displaying the number 
        System.out.println("The sum is: "+num2);
        
	}

}
