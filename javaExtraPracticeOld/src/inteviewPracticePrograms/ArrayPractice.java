package inteviewPracticePrograms;

import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		int [] arr = new int[5];
		arr[0]=12;
		arr[1]=15;
		arr[2]=18;
		arr[3]=21;
		arr[4]=24;
		System.out.println(arr);
		
		char[] ar = new char[3];
		ar[0]='r';
		ar[1]='a';
		ar[2]='m';
		System.out.println(ar);
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Postive intger");
		
		for(int i=0; i<5;i++){
			num[i]=sc.nextInt();
		}
		
		for(int i=0;i<5;i++){
			if (num[i]%2 ==0){
				num[i] = num[i]/2;
			}
			else {
				num[i] = 2*num[i];			}
		}
		

		for (int i=0;i<5;i++){
			System.out.println(num[i]);
		}
		System.out.println("**************");
		//Swapping adjacent elements of array
		int swap=0;

		for (int i=0;i<5;i=i+2){

			if (i!=(num.length-1)){
				swap = num[i];
				//System.out.println("Swap is: "+swap);
				num[i]=num[i+1];
				System.out.println(num[i]);
				num[i+1]=swap;
				System.out.println(num[i+1]);
			}
			else{
				num[(num.length-1)]=num[(num.length-1)];
				System.out.println(num[(num.length-1)]);
			}
		}	
    	sc.close();
	}

}
