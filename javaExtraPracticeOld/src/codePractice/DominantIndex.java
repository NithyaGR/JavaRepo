package codePractice;

public class DominantIndex {
	
	public static int dominantIndex(int[] nums) {
        int max = nums[0], index=0;
        for(int i=1; i< nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
                index = i;
            }
        }
        System.out.println(max);
        return index;
    }
	public static void main(String[] args) {
		int[] arr = {3, 6, 1, 0};
		System.out.println(dominantIndex(arr));
	}

}
