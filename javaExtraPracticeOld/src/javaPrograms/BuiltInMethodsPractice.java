package javaPrograms;

public class BuiltInMethodsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*Assignment  Write programs to compare 4 different strings using compareTo() method       

Write a program to compare 2 strings using equals() method       
       
Write a program to use methods toUppercase() and toLowercase()       
       
       
Assignment         
Write a method to check if 2 numbers are equal or not.       
Write a program using round() method       
Write a program using random() Method       
Write a program using toString() method in Arrays class    */
		
		String st1 = "Selenium";
		String st2 = "Training";
		String st3 = "MY NAME";
		String st4 = "my name";
		System.out.println(st1.equals(st2));
		
		System.out.println(st1.toUpperCase());
		
		System.out.println(st1.compareTo(st2));
		
		System.out.println(st3.toLowerCase());
		
		System.out.println(st1.charAt(6));
		
		System.out.println(st3.equalsIgnoreCase(st4));
		
		System.out.println(st1.substring(5));
		
		System.out.println(st3.substring(3, 7));
		
		System.out.println(st4.trim());
		
		double d1 = 2.345;
		double d2 = -2.453;
		int i = 200;
		int j = 250;
		Integer object1, object2;
		object1 = i;
		object2 = j;
		
		
		System.out.println(Math.abs(d2));
		System.out.println(Math.round(d2));
		System.out.println(Math.min(d1, d2));
		System.out.println(Math.max(d1, d2));
		System.out.println(Math.random());		
		System.out.println(object1.equals(i));
		System.out.println(object1.compareTo(5));
		System.out.println(object1.compareTo(j));
		
		char c1 = 'A';
		char c2 = '1';
		System.out.println(Character.isLetter(c1));
		System.out.println(Character.isLetter(c2));
		System.out.println(Character.isDigit(c1));
		System.out.println(Character.isDigit(c2));
		System.out.println(Character.isUpperCase(c1));
		System.out.println(Character.isLowerCase(c1));
		System.out.println(object2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
