package problem_0003_longestSubstringWithoutRepeatingCharacters;

public class Solution01 {

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
		
		int ans = 0;
		
		for(int i=0; i<len-1; i++) {
			loop : for(int j=i; j<len; j++) {
				for(int k=i; k<j; k++) {
					if(s.charAt(j) == s.charAt(k)) {
						i = k+1;
						continue loop;
					}
				}
				
				int n = j-i+1;
				if(n > ans)
					ans = n;
			}
		}
		
		return ans;
	}
}
