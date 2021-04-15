package codePractice;

public class IsLucky {

	static boolean isLucky(int n) {
		boolean result = false;
		int totalDigits = (int) (Math.log10(n)+1);
		int halfDigits = totalDigits/2;
		/*
		 * String num = Integer.toString(n); String first = num.substring(0,
		 * halfDigits); int firstHalf = Integer.parseInt(first); String last =
		 * num.substring(halfDigits); int secondHalf = Integer.parseInt(last);
		 * if(digitSum(firstHalf) == digitSum(secondHalf)) { result = true; }
		 */
		int sum = 0, reminder = 0, count=0;
		int secondHalfSum = 0, firstHalfSum = 0;
		while(n>0) {
			reminder = n%10;
			sum = sum+reminder;
			count++;
			n=n/10;
			if(count == halfDigits) {
				 secondHalfSum = sum;
				sum = 0;
			}
			if(count == totalDigits) {
				 firstHalfSum = sum;
			}
		}
		if(firstHalfSum == secondHalfSum) {
			result = true;
		}
		return result;
		}
	static int digitSum(int n) {
		int sum = 0, reminder = 0;
		while(n>0) {
			reminder = n%10;
			sum = sum+reminder;
			n = n/10;
		}
		System.out.println(sum);
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(isLucky(1234));
		//digitSum(1234);
	}

}
