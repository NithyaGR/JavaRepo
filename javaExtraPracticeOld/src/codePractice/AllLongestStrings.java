package codePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllLongestStrings {

	static String[] allLongestStrings(String[] inputArray) {
	     
	    int[] lengthArray = new int[inputArray.length];
	    List<String> newList = new ArrayList<>();
	    lengthArray[0] = inputArray[0].length();
	        int min = lengthArray[0];
	        int max = lengthArray[lengthArray.length-1];
	        for(int i=0; i<lengthArray.length; i++) {
	        	lengthArray[i] = inputArray[i].length();
	        	if(min>lengthArray[i]) {
	        		min = lengthArray[i];
	        	}
	        	if(max < lengthArray[i]) {
	        		max = lengthArray[i];
	        	}
	        }
	        System.out.println(min);
	        System.out.println(max);
	        for(int i=0; i< inputArray.length; i++) {
	        	if(inputArray[i].length() == max) {
	        		newList.add(inputArray[i]);
	        	}
	        }
	        System.out.println(newList);
	        String[] longestStringArray = new String[newList.size()];
	        longestStringArray = newList.toArray(longestStringArray);
	        
	    return longestStringArray;
	}
	public static void main(String[] args) {
		String[] nameArray = {"abacaba", 
				 "abacab", 
				 "abac", 
				 "xxxxxx"};
		//{"aaa","abcd","efg","Nithya"}
		String[] result = allLongestStrings(nameArray);
		for(int i = 0; i< result.length; i++) {
			System.out.println(result[i]);
		}
		

	}

}/*
*  if length of array =1, send the exact 
*/
