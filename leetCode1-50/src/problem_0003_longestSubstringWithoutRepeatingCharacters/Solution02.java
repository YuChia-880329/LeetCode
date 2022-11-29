package problem_0003_longestSubstringWithoutRepeatingCharacters;

public class Solution02 {

	
	/*
  		s.length() : n
  		
  		Time Complexity : O(n^3)
	*/
	public static int lengthOfLongestSubstring(String s) {
		
		
		int len = s.length();
		
		if(len == 0)
			return 0;
		if(len == 1)
			return 1;
		
		return lengthOfLongestSubstringRecur(s, 0, s.length()-1);
	}
	
	private static int lengthOfLongestSubstringRecur(String str, int lIndex, int rIndex) {
		if(lIndex == rIndex)
			return 1;
		
		int middleIndex = (lIndex+rIndex) / 2;
		
		int leftMax = lengthOfLongestSubstringRecur(str, lIndex, middleIndex);
		int rightMax = lengthOfLongestSubstringRecur(str, middleIndex+1, rIndex);
		int midMax = middleMax(str, lIndex, rIndex, middleIndex);
		
		int ans = (leftMax>rightMax) ? leftMax : rightMax;
		return (midMax>ans) ? midMax : ans;
	}
	
	private static int middleMax(String str, int lIndex, int rIndex, int middleIndex) {
		
		if(str.charAt(middleIndex) == str.charAt(middleIndex+1))
			return 0;
		
		
		int l = lIndex;
		loop1 : for(int i=middleIndex-1; i>=lIndex; i--) {
			for(int j=middleIndex+1; j>i; j--) {
				if(str.charAt(i) == str.charAt(j)) {
					l = i+1;
					break loop1;
				}	
			}
		}
		
		
		int r = middleIndex+1;
		int ans = r-l+1;
		while(r<rIndex && l<=middleIndex) {
			loop2 : for(int i=r+1; i<=rIndex; i++) {
				for(int j=l; j<i; j++) {
					if(str.charAt(i) == str.charAt(j)) {
						r = i-1;
						int num = r-l+1;
						ans = (num>ans) ? num : ans;
						l = j+1;
						break loop2;
					}	
				}
				
				if(i == rIndex) {
					r = rIndex;
					int num = r-l+1;
					ans = (ans>num) ? ans : num;
				}
			}
		}
		
		return ans;
	}
}
