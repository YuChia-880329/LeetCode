package problem_0003_longestSubstringWithoutRepeatingCharacters;

public class Main {

	/*
	 	Given a string s, find the length of the longest substring without repeating 
	 	characters.
	 	
	 	
	 	---------------------------------------------------------------------------------
	 	
	 	
	 	Constraints:

			0 <= s.length <= 5 * 104
			s consists of English letters, digits, symbols and spaces.
			
	 */
	public static void main(String[] args) {
		
		String s1 = "abcabcbb";
		String s2 = "bbbbb";
		String s3 = "pwwkew";
		String s4 = "apc";
		String s5 = "j";
		String s6 = "";
		String s7 = "adagri-*7=ndk";
		String s8 = "jeigiowobme";

		
		System.out.println("01 : " + Solution01.lengthOfLongestSubstring(s1));
		System.out.println("02 : " + Solution01.lengthOfLongestSubstring(s2));
		System.out.println("03 : " + Solution01.lengthOfLongestSubstring(s3));
		System.out.println("04 : " + Solution01.lengthOfLongestSubstring(s4));
		System.out.println("05 : " + Solution01.lengthOfLongestSubstring(s5));
		System.out.println("06 : " + Solution01.lengthOfLongestSubstring(s6));
		System.out.println("07 : " + Solution01.lengthOfLongestSubstring(s7));
		System.out.println("08 : " + Solution01.lengthOfLongestSubstring(s8));
		
		
		System.out.println("============================================================");
		
		
		System.out.println("01 : " + Solution02.lengthOfLongestSubstring(s1));
		System.out.println("02 : " + Solution02.lengthOfLongestSubstring(s2));
		System.out.println("03 : " + Solution02.lengthOfLongestSubstring(s3));
		System.out.println("04 : " + Solution02.lengthOfLongestSubstring(s4));
		System.out.println("05 : " + Solution02.lengthOfLongestSubstring(s5));
		System.out.println("06 : " + Solution02.lengthOfLongestSubstring(s6));
		System.out.println("07 : " + Solution02.lengthOfLongestSubstring(s7));
		System.out.println("08 : " + Solution02.lengthOfLongestSubstring(s8));
		
		
		System.out.println("============================================================");
		
		
		System.out.println("01 : " + Solution03.lengthOfLongestSubstring(s1));
		System.out.println("02 : " + Solution03.lengthOfLongestSubstring(s2));
		System.out.println("03 : " + Solution03.lengthOfLongestSubstring(s3));
		System.out.println("04 : " + Solution03.lengthOfLongestSubstring(s4));
		System.out.println("05 : " + Solution03.lengthOfLongestSubstring(s5));
		System.out.println("06 : " + Solution03.lengthOfLongestSubstring(s6));
		System.out.println("07 : " + Solution03.lengthOfLongestSubstring(s7));
		System.out.println("08 : " + Solution03.lengthOfLongestSubstring(s8));

	}

}
