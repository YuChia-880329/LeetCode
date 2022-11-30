package problem_0004_medianOfTwoSortedArrays;

public class Solution01 {

	/*
	 	nums1.length : m
		nums2.length : n
		
		Time Complexity : n+m
	*/
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
		int len1 = nums1.length;
		int len2 = nums2.length;
		int len = len1 + len2;
		
		
		if(len == 1)
			return (len1==0) ? nums2[0] : nums1[0];
		
		
		int[] mergeArray = new int[len];
		
		for(int i=0, j=0, k=0; k<len; k++) {
			boolean b = false;
			
			if(i >= len1 && j<len2)
				b = true;
			else if(j >= len2)
				b = false;
			else
				b = nums1[i] > nums2[j];
			
			mergeArray[k] = b ? nums2[j] : nums1[i];
			
			if(b)
				j++;
			else
				i++;
		}
		
		if(len%2 == 0)
			return (mergeArray[len/2-1] + mergeArray[len/2])/2.0;
		else
			return mergeArray[len/2];
    }
}
