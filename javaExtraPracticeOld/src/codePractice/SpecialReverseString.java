package codePractice;

public class SpecialReverseString {

	static String reverseInParentheses(String inputString) {
		
	        int start = inputString.lastIndexOf("(");
	        int end = inputString.indexOf(")", start);
	        if(start == -1 || end == -1 || start > end)
	            return inputString;
	        return reverseInParentheses(inputString.substring(0, start) 
	        		+ new StringBuilder(inputString.substring(start+1, end)).reverse().toString() 
	        		+ inputString.substring(end+1));
	    }
		
	public static void main(String[] args) {
		System.out.println(reverseInParentheses("foo(bar)baz(blim)"));
	
		//System.out.println(findParenthesis("bar","("));
		//System.out.println(getInnerParenthesis("foo(bar(baz))blim"));

	}

}
//foo(bar)baz(blim)
/*
 * For inputString = "foo(bar(baz))blim", the output should be
reverseInParentheses(inputString) = "foobazrabblim".
Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
"foo(bar)baz(blim)"
 */

/*
 * String result="", toBeReversed="", toBeReplaced = ""; int indexBeginning = 0,
 * indexEnd=0, indexEndSecond=0, len = 0; if(inputString == ""){ return result;
 * } if(inputString == "()"){ return result; } if(nestedParenthesis(inputString)
 * == false) {
 * 
 * indexBeginning = inputString.indexOf("("); indexEnd =
 * inputString.indexOf(")"); //first occurrence of ) toBeReversed =
 * inputString.substring(indexBeginning+1, indexEnd);
 * System.out.println(toBeReversed); toBeReplaced =
 * inputString.substring(indexBeginning, indexEnd+1);
 * System.out.println(toBeReplaced); len = toBeReversed.length();
 * System.out.println(len); String reversed = ""; for(int i=(len-1);i>=0; i--) {
 * reversed = reversed+toBeReversed.charAt(i); }
 * 
 * System.out.println(reversed); System.out.println(inputString); result =
 * inputString.replace(toBeReplaced, reversed); indexBeginning =
 * result.indexOf("("); System.out.println("****");
 * System.out.println(indexBeginning); System.out.println(result);
 * if(findParenthesis(result, "(") != -1) { result =
 * reverseInParentheses(result);
 * 
 * } return result; } else { System.out.println("Nested Parentesis code");
 * result = reverseInParentheses(getInnerParenthesis(inputString)); // this
 * needs to be replaced indexBeginning = inputString.indexOf("("); indexEnd =
 * inputString.indexOf(")"); indexEndSecond = inputString.indexOf(")",
 * indexEnd+1); String toBeReplaced1 = inputString.substring(indexBeginning+1,
 * indexEndSecond);
 * System.out.println(" to be replaced in getInnerPar "+toBeReplaced1);
 * System.out.println(" result "+result); result =
 * inputString.replace(toBeReplaced1, result); System.out.println(result); if
 * (checkParenthesis(result) == true) { return reverseInParentheses(result); }
 * else { return result; }
 * 
 * }
 * 
 * 
 * } static boolean checkParenthesis(String in) { boolean result = false;
 * if(in.indexOf("(") != -1) { result = true; return result; } return result; }
 * static boolean nestedParenthesis(String input) { boolean nested = false; int
 * indexBeginning = input.indexOf("("); int indexEnd = input.indexOf(")"); int
 * indexMiddle = input.substring(indexBeginning+1, indexEnd).indexOf("(");
 * System.out.println("nested parenthesis"); if(indexMiddle != -1) { nested =
 * true; }
 * 
 * return nested; } static String getInnerParenthesis(String input) { String
 * inner= ""; int indexBeginning = input.indexOf("("); int indexEnd =
 * input.indexOf(")"); int indexEndSecond = input.indexOf(")", indexEnd+1);
 * System.out.println(indexBeginning); System.out.println(indexEndSecond);
 * System.out.println(input); inner = input.substring(indexBeginning+1,
 * indexEndSecond);
 * 
 * return inner; } static int findParenthesis(String input, String reg) { int
 * index = 0; index = input.indexOf(reg); return index;
 */
