package problem_0004_medianOfTwoSortedArrays;

public class Solution02 {

	/*
 		nums1.length : m
		nums2.length : n
	
		Time Complexity : WorstCase -> O(nlgn),  BestCase -> O(lgn)
	*/
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    
		int len = nums1.length + nums2.length;
		
		if(len%2 == 0) {
			int n1 = findRankedNum(nums1, nums2, len/2);
			int n2 = findRankedNum(nums1, nums2, len/2+1);
			return (n1+n2)/2.0;
		}
		
		return findRankedNum(nums1, nums2, len/2+1);
	}
	private static int findRankedNum(int[] nums1, int[] nums2, int rank) {
		return findRankedNumRecur(nums1, nums2, 0, 0, rank);
	}
	
	private static int findRankedNumRecur(int[] nums1, int[] nums2, int nums1LIndex, int nums2LIndex, int rank) {
		if(nums1LIndex >= nums1.length)
			return nums2[nums2LIndex + rank - 1];
		if(nums2LIndex >= nums2.length)
			return nums1[nums1LIndex + rank - 1];
		
		
		int len1 = nums1.length-nums1LIndex;
		int len2 = nums2.length-nums2LIndex;
		
		boolean b = len1<=len2;
		
		int target = b ? nums1[nums1LIndex] : nums2[nums2LIndex];
		int resultIndex = b ? binarySearch(nums2, nums2LIndex, nums2.length-1, target) : binarySearch(nums1, nums1LIndex, nums1.length-1, target);
		
		int resultRank = b ? getRankFromResultIndex(resultIndex, nums2LIndex) : getRankFromResultIndex(resultIndex, nums1LIndex);
		
		
		if(resultRank == rank) 
			return target;
		if(resultRank > rank)
			return b ? nums2[nums2LIndex+rank-1] : nums1[nums1LIndex+rank-1];
		
		if(b) {
			nums1LIndex++;
			nums2LIndex = nums2LIndex+resultRank-1;
		}else {
			nums2LIndex++;
			nums1LIndex = nums1LIndex+resultRank-1;
		}
		
		rank -= resultRank;
		
		
		return findRankedNumRecur(nums1, nums2, nums1LIndex, nums2LIndex, rank);
	}
	private static int getRankFromResultIndex(int resultIndex, int lIndex) {
		if(resultIndex >= 0)
			return resultIndex-lIndex+2;
		
		resultIndex = -resultIndex-1;
		
		return resultIndex-lIndex+1;
	}
	
	private static int binarySearch(int[] nums, int lIndex, int rIndex, int target) {
		if(lIndex == rIndex)
			return (target>nums[lIndex]) ? -lIndex-2 : ((target<nums[lIndex]) ? -lIndex-1 : lIndex);
		
		
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
		
		return -lIndex-1;
	}
}