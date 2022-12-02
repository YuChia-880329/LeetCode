package problem_0005_longestPalindromicSubstring;

public class SolutionTimeLimitExceeded02 {

	/*
 		s.length : n

 		Time Complexity : WorstCase O(n^3), BestCase O(n^2)
	*/
	public static String longestPalindrome(String s) {
		int len = s.length();
		
		if(len == 1)
			return s;
		
		
		for(int i=len; i>=2; i--) {
			loop : for(int j=0; j<=len-i; j++) {
				int rightIndex = j+i-1;
				
				for(int k=0; k<i/2; k++) {
					if(s.charAt(j+k) != s.charAt(rightIndex-k))
						continue loop;
				}
				
				return s.substring(j, rightIndex+1);
			}
		}
		
		return s.substring(0, 1);
	}
}
