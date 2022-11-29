package problem_0001_twoSum;

import java.util.Arrays;

public class Main {

	/*
	 	Given an array of integers nums and an integer target, return indices of the 
	 	two numbers such that they add up to target.

		You may assume that each input would have exactly one solution, and you may 
		not use the same element twice.

		You can return the answer in any order.
	 
	 -------------------------------------------------------------------------------------
	 
	 	Constraints:

			2 <= nums.length <= 104
			-109 <= nums[i] <= 109
			-109 <= target <= 109
			Only one valid answer exists.
	 */
	public static void main(String[] args) {
		
		int[] nums01 = {2, 7, 11, 15};
		int target01 = 9;
		
		
		int[] nums02 = {3,2,4};
		int target02 = 6;
		
		
		int[] nums03 = {3,3};
		int target03 = 6;
		
		
		
		System.out.println("01 : " + Arrays.toString(Solution01.twoSum(nums01, target01)));
		System.out.println("02 : " + Arrays.toString(Solution01.twoSum(nums02, target02)));
		System.out.println("03 : " + Arrays.toString(Solution01.twoSum(nums03, target03)));
		
		System.out.println("==========================================================");
		
		System.out.println("01 : " + Arrays.toString(Solution02.twoSum(nums01, target01)));
		System.out.println("02 : " + Arrays.toString(Solution02.twoSum(nums02, target02)));
		System.out.println("03 : " + Arrays.toString(Solution02.twoSum(nums03, target03)));
	}

}
