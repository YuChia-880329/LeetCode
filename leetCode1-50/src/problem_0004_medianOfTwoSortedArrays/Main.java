package problem_0004_medianOfTwoSortedArrays;

public class Main {

	/*
	  	Given two sorted arrays nums1 and nums2 of size m and n respectively, 
	  	return the median of the two sorted arrays.

		The overall run time complexity should be O(log (m+n)).
		
		
		----------------------------------------------------------------------
		
		
		Constraints:

			nums1.length == m
			nums2.length == n
			0 <= m <= 1000
			0 <= n <= 1000
			1 <= m + n <= 2000
			-106 <= nums1[i], nums2[i] <= 106
	 */
	public static void main(String[] args) {
		
		int[] nums101 = {1, 3};
		int[] nums201 = {2};
		
		
		int[] nums102 = {1, 2};
		int[] nums202 = {3, 4};
		
		
		int[] nums103 = {1, 3, 7, 9, 13};
		int[] nums203 = {2, 10, 11, 12};
		
		
		int[] nums104 = {7};
		int[] nums204 = {};
		
		
		int[] nums105 = {};
		int[] nums205 = {17};
		
		
		int[] nums106 = {-2000,1,3, 9,18,66,1000};
		int[] nums206 = {2};
		
		
		
		System.out.println("01 : " + Solution01.findMedianSortedArrays(nums101, nums201));
		System.out.println("02 : " + Solution01.findMedianSortedArrays(nums102, nums202));
		System.out.println("03 : " + Solution01.findMedianSortedArrays(nums103, nums203));
		System.out.println("04 : " + Solution01.findMedianSortedArrays(nums104, nums204));
		System.out.println("05 : " + Solution01.findMedianSortedArrays(nums105, nums205));
		System.out.println("06 : " + Solution01.findMedianSortedArrays(nums106, nums206));
		
		
		System.out.println("===================================================================");
		
		
		System.out.println("01 : " + Solution02.findMedianSortedArrays(nums101, nums201));
		System.out.println("02 : " + Solution02.findMedianSortedArrays(nums102, nums202));
		System.out.println("03 : " + Solution02.findMedianSortedArrays(nums103, nums203));
		System.out.println("04 : " + Solution02.findMedianSortedArrays(nums104, nums204));
		System.out.println("05 : " + Solution02.findMedianSortedArrays(nums105, nums205));
		System.out.println("06 : " + Solution02.findMedianSortedArrays(nums106, nums206));
	}

}
