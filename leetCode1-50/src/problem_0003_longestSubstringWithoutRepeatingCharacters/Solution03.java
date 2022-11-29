package problem_0003_longestSubstringWithoutRepeatingCharacters;

public class Solution03 {

	/*
  		s.length() : n
  	
  		Time Complexity : O(n^2)
	*/
	public static int lengthOfLongestSubstring(String s) {
		
		
		int len = s.length();
		
		if(len == 0)
			return 0;
		if(len == 1)
			return 1;
		
		int ans = 1;
		int index = 0;
		
		for(int i=1; i<len; i++) {
			for(int j=i-1; j>=index; j--) {
				if(s.charAt(i) == s.charAt(j)) {
					index = j+1;
				}
			}
			
			int num = i-index+1;
			ans = (num>ans) ? num : ans;
		}
		
		return ans;
	}
}
