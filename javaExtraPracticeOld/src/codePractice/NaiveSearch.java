package codePractice;

public class NaiveSearch {
	
	static int naiveSearch(String longString, String shortString){
		int count = 0;
		for(int i=0; i<longString.length(); i++) {
			
			for(int j=0; j<shortString.length(); j++) {
				
				if(shortString.charAt(j) != longString.charAt(i+j)) {
					//i+j 
		               
		               break;
	           }
				if(j == shortString.length() - 1) {
		               count++;
		           }
				
			}
		}
			
		return count;
	}
	public static void main(String[] args) {
		System.out.println(naiveSearch("lorie loled", "lol"));
	}
	
}
