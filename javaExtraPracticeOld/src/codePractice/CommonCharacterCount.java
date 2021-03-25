package codePractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//check
public class CommonCharacterCount {
    static Map<Character, Integer> duplicateString(String s1){
    	
    	Map<Character, Integer> letters = new HashMap<>();
	    
	    for(int i=0; i<s1.length(); i++) {
	    	if(letters.get(s1.charAt(i)) == null) {
	    		letters.put(s1.charAt(i), 1);
	    	}
	    	else {
	    		letters.put(s1.charAt(i), letters.get(s1.charAt(i))+1);
	    	}
	    }
	    Set<Character> charSet = letters.keySet();
	    Iterator<Character> it = charSet.iterator();
	    while(it.hasNext()) {
	    	Character c = it.next();
	    	System.out.println(c +"---"+letters.get(c));
	    	
	    }
    	return letters;
    }
	static int commonCharacterCount(String s1, String s2) {
	    int commonCount = 0;
	    Map<Character, Integer> dupString1 = duplicateString(s1);
	    Map<Character, Integer> dupString2 = duplicateString(s2);
	    System.out.println(dupString1);
	    System.out.println(dupString2);
	    
	    
	    for (Map.Entry<Character, Integer> entry1 : dupString1.entrySet()) {
	    	  Character key = entry1.getKey();
	    	  Integer value1 = entry1.getValue();
    		  Integer value2 = 0;
	    	  
	    	  if(dupString2.get(key) != null) {
	    		  value2 = dupString2.get(key); 
	    	  }
	    	  if(value2 == value1) {
	    		  commonCount = commonCount+ value1;
	    	  }
	    	  else {
	    		  commonCount = commonCount + Math.min(value1, value2);
	    	  }
	    	  // do whatever with value1 and value2 
	    	}
		/*
		 * for(int i=0; i<s1.length(); i++){ for(int j=0; j<s2.length(); j++){ if
		 * (s1.charAt(i) == s2.charAt(j)){ System.out.println(s1.charAt(i)+"---"+
		 * s2.charAt(j)); commonCount++; } } }
		 */
	    
	    return commonCount;
	}
	public static void main(String[] args) {
		System.out.println(commonCharacterCount("totalqa", "tot"));

	}

}
