package problem_0005_longestPalindromicSubstring;

public class SolutionTimeLimitExceeded03 {

	
	/*
		s.length : n

		Time Complexity : WorstCase O(n^3), BestCase O(n^2)
	*/
	public static String longestPalindrome(String s) {
		int len = s.length();
		
		
		int[] indices = {0, 0};
		for(int i=0; i<len-1; i++) {
			char ch = s.charAt(i);
			
			int rIndex = len;
			
			loop : while((rIndex = searchChar(s, i+1, rIndex-1, ch)) != -1) {
				
				int middleIndex = (i+rIndex)/2;
				for(int j=1; j<=(middleIndex-i); j++) {
					if(s.charAt(i+j) != s.charAt(rIndex-j))
						continue loop;
				}
				
				if((rIndex-i+1) > (indices[1]-indices[0]+1)) {
					indices[0] = i;
					indices[1] = rIndex;
				}
			}
		}
		
		
		return s.substring(indices[0], indices[1]+1);
	}
	private static int searchChar(String str, int lIndex, int rIndex, char target) {
		for(int i=rIndex; i>=lIndex; i--) {
			if(str.charAt(i) == target)
				return i;
		}
		
		return -1;
	}
}
