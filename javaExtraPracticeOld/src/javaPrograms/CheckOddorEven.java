package javaPrograms;

public class CheckOddorEven {
	
	public String checkOddOrEven(int i){
		
		String flag = null;
		
		int j = i%2;
		if (j==0){
			flag = "even";
			
		}
		else if (j==1){
			flag = "odd";
			
		}
		return flag;
		
		
	}

	public static void main(String[] args) {


		CheckOddorEven NumObj = new CheckOddorEven();
		System.out.println("The given number is :" +NumObj.checkOddOrEven(5));
		

	}

}
