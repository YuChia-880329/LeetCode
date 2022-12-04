package problem_0007_reverseInteger;

public class Solution01 {

	/*
	 	x's digitCount : n
	 	
	 	Time Complexity : O(n)
	*/
	public static int reverse(int x) {
		
		if(x<10 && x>-10)
			return x;
		if(x == -2147483648)
			return 0;
        
		
		boolean isNegative = false;
		if(x < 0) {
			x *= -1;
			isNegative = true;
		}
		
		
		while(x%10 == 0) {
			x /= 10;
		}
		
		
		int ans = 0;
		while(x != 0) {
			if(ans >= 214748365)
				return 0;
			ans *= 10;
			ans += (x % 10);
			x /= 10;
		}
		

		return isNegative ? -ans : ans;
    }
}
