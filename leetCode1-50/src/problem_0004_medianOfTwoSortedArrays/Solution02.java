package problem_0004_medianOfTwoSortedArrays;

public class Solution02 {

	/*
 		nums1.length : m
		nums2.length : n
	
		Time Complexity : 
	*/
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    
		
	
		return 0;
	}
	
	private static double findRankedNumRecur(int[] nums1, int[] nums2, int nums1LIndex, int nums1RIndex, int nums2LIndex, int nums2RIndex, int rank) {
		if(nums1LIndex > nums1RIndex)
			return nums2[nums2LIndex + rank - 1];
		if(nums2LIndex > nums2RIndex)
			return nums1[nums1LIndex + rank - 1];
		
		
		int len1 = nums1RIndex-nums1LIndex+1;
		int len2 = nums2RIndex-nums2LIndex+1;
		
		
		return 0;
	}
	
	public static int binarySearch(int[] nums, int lIndex, int rIndex, int target) {
		if(lIndex == rIndex)
			return (target>nums[lIndex]) ? -2 : ((target<nums[lIndex]) ? -1 : 0);
		
		
		while(lIndex <= rIndex) {
			int middleIndex = (lIndex+rIndex)/2;
			int middle = nums[middleIndex];
			
			if(target > middle)
				lIndex = middleIndex+1;
			else if(target < middle)
				rIndex = middleIndex-1;
			else
				return middleIndex;
		}
		
		return -(lIndex+1);
	}
}
