package codePractice;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortByHeight {
	
	static void SortByHeight(int arr[]) {
		/*
		 * List<Integer> list = new ArrayList<Integer>(arr.length); for(int i: arr) {
		 * list.add(i); }
		 * 
		 * System.out.println(list);
		 */
		int temp = 0;
		for(int i = 0; i<arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] != -1 && arr[j] != -1) {
					if(arr[i]>arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
				
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int [] arr = {-1, 150, 190, 170, -1, -1, 160, 180};
		SortByHeight(arr);
	}

}
/* PTR
 * first for loop is to choose the number to compare with the rest
 * second for loop - is actually doing the swapping
 * in the second loop include condition to omit -1
 * for loop - condition - j should start i+1 till array length. 
 * swap logic
 * 
 * if(arr[i]>arr[j] {
 * temp = arr[i];
 * arr[i] = arr[j];
 * arr[j] = temp;
 * }
 * */
