package problem_0008_stringToInteger_atoi;

public class Solution01 {

	/*
		s.length() : n
		
		Time Complexity : O(n)
	*/
	public static int myAtoi(String s) {
	
		int len = s.length();
		
		
		if(len == 0)
			return 0;
		
		char ch = ' ';
		
		int index = 0;
		while((index<len) && ((ch=s.charAt(index++))==' ')) {
		}
		
		boolean isPositive = true;
		if(ch == '-') 
			isPositive = false;
		else if(ch!='+' && !isNumberDigit(ch))
			return 0;
	
		
		int number = 0;
		if(isNumberDigit(ch)) 
			number += (ch-'0');
		while((index<len) && isNumberDigit(ch=s.charAt(index++))) {
			
			if(number >= 214748365)
				return isPositive ? 2147483647 : -2147483648;
			
			byte n = (byte)(ch-'0');
			if(number==214748364 && n>=8)
				return isPositive ? 2147483647 : -2147483648;
			number *= 10;
			number += n;
		}
		
		number = isPositive ? number : -number;
		return number;
	}
	
	private static boolean isNumberDigit(char ch) {
		return (ch>='0' && ch<='9');
	}
}
