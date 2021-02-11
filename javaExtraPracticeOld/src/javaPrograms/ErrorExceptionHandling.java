package javaPrograms;

import java.util.ArrayList;

public class ErrorExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Arithmetic Exception
		int num = 10;
		int num1 = 0;
		try{
			num /=num1;
			System.out.println("??????????????");
		System.out.println(num/num1);
		}
		
		catch(ArithmeticException e){
			System.out.println("You can't divide an integer by 0");
		}

		catch(Exception ex){
			System.out.println("Exception");
		}
		finally{
			System.out.println("Printing the Finally Block");
			}
		// Null PointerException
		try{
			
		//String st = null;
		//System.out.println(st.length());
		}
		catch(NullPointerException ne){
			System.out.println("It's a null value string");
		}
		
		//Index out bound exception
		try{
			
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("My");
		list.add("Name");
		System.out.println(list.get(2));
		
		}
		catch (IndexOutOfBoundsException io){
			System.out.println("Invalid index");
		}
		
		
		
		
	}
	

}
