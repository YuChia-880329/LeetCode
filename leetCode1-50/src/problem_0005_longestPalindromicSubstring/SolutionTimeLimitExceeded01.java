package problem_0005_longestPalindromicSubstring;

public class SolutionTimeLimitExceeded01 {
	
	/*
	 	s.length : n
	 	
	 	Time Complexity : WorstCase O(n^3), BestCase O(n^2)
	*/
	public static String longestPalindrome(String s) {
        
		int len = s.length();
		
		int[] indices = {0, 0};
		for(int i=0; i<len-1; i++) {
			loop : for(int j=i+1; j<len; j++) {
				int length = j-i+1;

				for(int k=0; k<=length/2; k++) {
					if(s.charAt(i+k) != s.charAt(j-k))
						continue loop;
				}
				
				if(length > (indices[1]-indices[0]+1)) {
					indices[0] = i;
					indices[1] = j;
				}
			}
		}
		return s.substring(indices[0], indices[1]+1);
    }
}
