package problem_0001_twoSum;

public class Solution01 {

	/*
	 	nums.length = n
	 	
	 	Time complexity : O(n^2)
	 */
	public static int[] twoSum(int[] nums, int target) {
        
        if(nums.length == 2)
            return new int[]{0, 1};
        
        int len = nums.length;
        for(int i=0; i<len-1; i++){
            for(int j=i+1; j<len; j++){
                if(nums[i]+nums[j] == target)
                    return new int[]{i, j};
            }
        }
        
        return null;
    }
}
