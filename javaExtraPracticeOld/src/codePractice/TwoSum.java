package codePractice;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

	public static List<Integer> twoSum(int[] nums, int target) {
	       List <Integer> result = new ArrayList<>();
	        int temp=0;
	        for(int i=0; i<(nums.length-1); i++){
	            temp = nums[i];
	            for(int j=1; j<nums.length; j++){
	                if (temp+nums[j] == target){
	                    result.add(i);
	                    result.add(j);
	                }
	            }
	        }
	        System.out.println(result);
	        return result;
	    }
	public static int[] twoSums(int[] nums, int target) {
	       //List <Integer> result = new ArrayList<>();
     int[] result = new int[2];
	        int temp=0, k=0;
         
	        for(int i=0; i<(nums.length-1); i++){
	            temp = nums[i];
	            for(int j=1; j<nums.length; j++){
	                if (temp+nums[j] == target && j!=i){
	                    result[k]=i;
	                    result[k+1]=j;
                     //k++;
                     break;
	                }
	            }
	        }
	        //System.out.println(result);
	        return result;
	    }
	public static void main(String[] args) {
		int[] nums = {-1,-2,-3,-4, -5};
        System.out.println(twoSum(nums, -8));
        int[] result = twoSums(nums, -8);
        for(int value : result) {
        	System.out.println(value);
        }
        

	}

}
