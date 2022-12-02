package problem_0005_longestPalindromicSubstring;

public class Main {

	/*
	  	Given a string s, return the longest palindromic substring in s.
	  	
	  	
	  	-----------------------------------------------------------------------
	  	
	  	
	  	Constraints:

			1 <= s.length <= 1000
			s consist of only digits and English letters.
	 */
	public static void main(String[] args) {
		
		String s01 = "babad";
		String s02 = "bb";
		String s03 = "abc";
		String s04 = "aaaaaaaaa";
		String s05 = "anifbbewioqbfqpwobfadsjabdfo";
		String s06 = "aijsmeifhpla924993rqffkq3242";
		String s07 = "ajissi";
		String s08 = "000000000000000000000000000000000000000000000000000000000000000000"
				+ "000000000000000000000000000000000000000000000000000000000000000000000"
				+ "000000000000000000000000000000000000000000000000000000000000000000000"
				+ "000000000000000000000000000000000000000000000000000000000000000000000"
				+ "000000000000000000000000000000000000000000000000000000000000000000000"
				+ "000000000000000000000000000000000000000000000000000000000000000000000"
				+ "000000000000000000000000000000000000000000000000000000000000000000000"
				+ "000000000000000000000000000000000000000000000000000000000000000000000"
				+ "000000000000000000000000000000000000000000000000000000000000000000000"
				+ "000000000000000000000000000000000000000000000000000000000000000000000"
				+ "000000000000000000000000000000000000000000000000000000000000000000000"
				+ "000000000000000000000000000000000000000000000000000000000000000000000"
				+ "000000000000000000000000000000000000000000000000000000000000000000000"
				+ "000000000000000000000000000000000000000000000000000000000000000000000"
				+ "0000000000000000000000000000000000000";
		String s09 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		
		
		System.out.println("01 : " + SolutionTimeLimitExceeded01.longestPalindrome(s01));
		System.out.println("02 : " + SolutionTimeLimitExceeded01.longestPalindrome(s02));
		System.out.println("03 : " + SolutionTimeLimitExceeded01.longestPalindrome(s03));
		System.out.println("04 : " + SolutionTimeLimitExceeded01.longestPalindrome(s04));
		System.out.println("05 : " + SolutionTimeLimitExceeded01.longestPalindrome(s05));
		System.out.println("06 : " + SolutionTimeLimitExceeded01.longestPalindrome(s06));
		System.out.println("07 : " + SolutionTimeLimitExceeded01.longestPalindrome(s07));
		System.out.println("08 : " + SolutionTimeLimitExceeded01.longestPalindrome(s08));
		System.out.println("09 : " + SolutionTimeLimitExceeded01.longestPalindrome(s09));
		
		
		System.out.println("===============================================================");
		
		
		System.out.println("01 : " + SolutionTimeLimitExceeded02.longestPalindrome(s01));
		System.out.println("02 : " + SolutionTimeLimitExceeded02.longestPalindrome(s02));
		System.out.println("03 : " + SolutionTimeLimitExceeded02.longestPalindrome(s03));
		System.out.println("04 : " + SolutionTimeLimitExceeded02.longestPalindrome(s04));
		System.out.println("05 : " + SolutionTimeLimitExceeded02.longestPalindrome(s05));
		System.out.println("06 : " + SolutionTimeLimitExceeded02.longestPalindrome(s06));
		System.out.println("07 : " + SolutionTimeLimitExceeded02.longestPalindrome(s07));
		System.out.println("08 : " + SolutionTimeLimitExceeded02.longestPalindrome(s08));
		System.out.println("09 : " + SolutionTimeLimitExceeded02.longestPalindrome(s09));
		
		
		System.out.println("===============================================================");
		
		
		System.out.println("01 : " + SolutionTimeLimitExceeded03.longestPalindrome(s01));
		System.out.println("02 : " + SolutionTimeLimitExceeded03.longestPalindrome(s02));
		System.out.println("03 : " + SolutionTimeLimitExceeded03.longestPalindrome(s03));
		System.out.println("04 : " + SolutionTimeLimitExceeded03.longestPalindrome(s04));
		System.out.println("05 : " + SolutionTimeLimitExceeded03.longestPalindrome(s05));
		System.out.println("06 : " + SolutionTimeLimitExceeded03.longestPalindrome(s06));
		System.out.println("07 : " + SolutionTimeLimitExceeded03.longestPalindrome(s07));
		System.out.println("08 : " + SolutionTimeLimitExceeded03.longestPalindrome(s08));
		System.out.println("09 : " + SolutionTimeLimitExceeded03.longestPalindrome(s09));
		
		
		System.out.println("===============================================================");
		
		
		System.out.println("01 : " + Solution01.longestPalindrome(s01));
		System.out.println("02 : " + Solution01.longestPalindrome(s02));
		System.out.println("03 : " + Solution01.longestPalindrome(s03));
		System.out.println("04 : " + Solution01.longestPalindrome(s04));
		System.out.println("05 : " + Solution01.longestPalindrome(s05));
		System.out.println("06 : " + Solution01.longestPalindrome(s06));
		System.out.println("07 : " + Solution01.longestPalindrome(s07));
		System.out.println("08 : " + Solution01.longestPalindrome(s08));
		System.out.println("09 : " + Solution01.longestPalindrome(s09));
	}

}
