package problem_0005_longestPalindromicSubstring;

public class Solution01 {

	/*
		s.length : n

		Time Complexity : 
	*/
	public static String longestPalindrome(String s) {
		
		int len = s.length();
		
		int[] indices = {0, 0};
		for(int i=0; i<len-1; i++) {
			
			if(s.charAt(i) == s.charAt(i+1))
				checkPalindrome(i, i+1, indices, s);
			
			checkPalindrome(i, indices, s);
			
		}

		return s.substring(indices[0], indices[1]+1);
	}
	
	private static int calcIndex(int lMiddleIndex, int rMiddleIndex, int offset, int direction) {
		if(direction > 0)
			return (rMiddleIndex + offset);
		else if (direction < 0)
			return (lMiddleIndex - offset);
		else
			return lMiddleIndex;
	}
	
	private static boolean shouldChangeIndices(int leftMost, int rightMost, int[] indices) {
		return ((rightMost-leftMost+1) > (indices[1]-indices[0]+1));
	}
	
	private static int[] checkPalindrome(int lMiddle, int rMiddle, int[] indices, String str) {
		
		int len = str.length();
		int leftMost = lMiddle;
		int rightMost = rMiddle;
		
		for(int j=1; (leftMost=calcIndex(lMiddle, rMiddle, j, -1))>=0 && (rightMost=calcIndex(lMiddle, rMiddle, j, +1))<len; j++) {
			if(str.charAt(leftMost) != str.charAt(rightMost)) {
				if(shouldChangeIndices(leftMost+1, rightMost-1, indices)) {
					indices[0] = leftMost+1;
					indices[1] = rightMost-1;
				}
				break;
			}
		}
		
		
		if(leftMost < 0) {
			if(shouldChangeIndices(leftMost+1, rightMost, indices)) {
				indices[0] = leftMost+1;
				indices[1] = rightMost;
			}
		}else if(rightMost >= len) {
			if(shouldChangeIndices(leftMost+1, rightMost-1, indices)) {
				indices[0] = leftMost+1;
				indices[1] = rightMost-1;
			}
		}
		return indices;
	}
	private static int[] checkPalindrome(int middle, int[] indices, String str) {
		
		return checkPalindrome(middle, middle, indices, str);
	}
}
