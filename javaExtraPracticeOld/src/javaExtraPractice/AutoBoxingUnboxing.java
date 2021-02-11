package javaExtraPractice;

import java.util.ArrayList;

public class AutoBoxingUnboxing {
	
	public static void main(String[] args){
		
		int i =10;
		//int j;
		//char c ='n';
		Integer iObj = new Integer(100);
		Integer iObject = i;//Autoboxing... Converting a primitive data type integer into its corresponding object Integer wrapper class
		System.out.println(iObject);
		//j=iObject;//unboxing - converting object wrapper class into its corresponding primitive datatype
		//System.out.println(j);
		ArrayList <Integer> intList = new ArrayList <Integer> ();
		intList.add(1);
		intList.add(2);
		intList.add(iObject);
		System.out.println(iObj.intValue());
		
		System.out.println(intList);
		System.out.println(iObj);
	}

}
