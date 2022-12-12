package problem_0008_stringToInteger_atoi;

public class Solution01 {

	/*
		
	
	*/
	public static int myAtoi(String s) {
	
		int len = s.length();
		
		
		if(len == 0)
			return 0;
		
		char ch = ' ';
		
		int index = 0;
		while((ch = s.charAt(index++)) == ' ') {
		}
		
		boolean isPositive = true;
		if(ch == '+') {
		}else if(ch == '-') {
			isPositive = false;
			ch = s.charAt(index++);
		}else {
			return 0;
		}
		
		int digit = 0;
		int number = 0;
		while(isNumberDigit(ch=s.charAt(index++))) {
			number += ((ch-'0')* (int)Math.pow(10, digit++));
		}
		
		number = isPositive ? number : -number;
		return number;
	}
	
	private static boolean isNumberDigit(char ch) {
		return (ch>='0' && ch<='9');
	}
}
