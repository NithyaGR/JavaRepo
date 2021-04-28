package codePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelKesy {

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        String[] two = {"a", "b", "c"};
        String[] three = {"d", "e", "f"};
        String[] four = {"g", "h", "i"};
        String[] five = {"j", "k", "l"};
        String[] six = {"m", "n", "o"};
        String[] seven = {"p", "q", "r", "s"};
        String[] eight = {"t", "u", "v"};
        String[] nine = {"w", "x", "y", "z"};
        
        List<String> al2 = new ArrayList<>(Arrays.asList(two));
        List<String> al3 = new ArrayList<>(Arrays.asList(three));
        List<String> al4 = new ArrayList<>(Arrays.asList(four));
        List<String> al5 = new ArrayList<>(Arrays.asList(five));
        List<String> al6 = new ArrayList<>(Arrays.asList(six));
        List<String> al7 = new ArrayList<>(Arrays.asList(seven));
        List<String> al8 = new ArrayList<>(Arrays.asList(eight));
        List<String> al9 = new ArrayList<>(Arrays.asList(nine));
        
        Map<String, List<String>> telKeys = new HashMap<String, List<String>>();
        telKeys.put("2",al2);
        telKeys.put("3",al3);
        telKeys.put("4",al4);
        telKeys.put("5",al5);
        telKeys.put("6",al6);
        telKeys.put("7",al7);
        telKeys.put("8",al8);
        telKeys.put("9",al9);

        if( digits.length() <1){
            
            return result;
        }
        if(digits.length() == 1){
            List<String> s = telKeys.get(digits);
            for(int i=0; i<s.size(); i++){

                result.add((String) s.get(i));
            }
            
        }
        //to find the pattern 2 with 3 - separating 2, 3, 4, 5, etc in a char array
		/*
		 * char[] charArray = new char[digits.length()]; for(int i=0;
		 * i<charArray.length; i++ ) { charArray[i] = digits.charAt(i);
		 * 
		 * }
		 */
        	
        	if(digits.length() == 2){
        		List<String> lis1 = telKeys.get(Character.toString(digits.charAt(0)));
        		List<String> lis2 = telKeys.get(Character.toString(digits.charAt(1)));
                result = concat(lis1, lis2);
            }  
        return result;
    }
    public static void concat(String s1, String s2) {
    	List<String> result = new ArrayList<>();
    	for(int i=0; i<s1.length(); i++) {
            for(int j=0; j<s2.length(); j++) {
                result.add(Character.toString(s1.charAt(i))+Character.toString(s2.charAt(j)));
            }
        }
    }
    public static List<String> concat(List<String> s1, List<String> s2) {
    	List<String> result = new ArrayList<>();
    	
    	for(int i=0; i<s1.size(); i++) {
            for(int j=0; j<s2.size(); j++) {
                result.add((s1.get(i))+s2.get(j));
            }
        }
    	//System.out.println(result);
    	return result;
    }
	public static void main(String[] args) {
		
		System.out.println(letterCombinations("3"));
		/*
		 * List<String> s1 = new ArrayList<>(); List<String> s2 = new ArrayList<>();
		 * List<String> s3 = new ArrayList<>(); s1.add("a"); s1.add("b"); s1.add("c");
		 * s2.add("d"); s2.add("e"); s2.add("f"); s3.add("g"); s3.add("h"); s3.add("i");
		 * 
		 * List<String> res = concat(s2,s3); System.out.println(res); List<String> res1
		 * = concat(s1,res); System.out.println(res1);
		 */
	}

}

/*"adg","adh","adi","aeg","aeh","aei","afg","afh","afi","bdg","bdh","bdi","beg","beh","bei","bfg","bfh","bfi",
 "cdg","cdh","cdi","ceg","ceh","cei","cfg","cfh","cfi"
 abc, def, ghi,
 
 [ad, ae, af, bd, be, bf, cd, ce, cf, gd, ge, gf, hd, he, hf, id, ie, if]
 */