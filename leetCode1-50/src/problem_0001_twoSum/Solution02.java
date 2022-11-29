package problem_0001_twoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution02 {

	/*
	 	nums.length = n
	 	
	 	Time complexity : O(n)
	 */
	public static int[] twoSum(int[] nums, int target) {
        
        if(nums.length == 2)
            return new int[]{0, 1};

        Map<Integer, Integer> map = new HashMap<>();
        map.put(target-nums[0], 0);

        for(int i=1; i<nums.length; i++){
            if(map.get(nums[i]) != null)
                return new int[]{map.get(nums[i]), i};

            map.put(target-nums[i], i);
        }

        return null;
    }
}
