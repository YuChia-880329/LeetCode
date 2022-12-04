package problem_0007_reverseInteger;

public class Main {

	/*
	 	Given a signed 32-bit integer x, return x with its digits reversed. If reversing
	 	x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], 
	 	then return 0.

			Assume the environment does not allow you to store 64-bit integers (signed or 
			unsigned).
			
			
		------------------------------------------------------------------------------------
		
		
		Constraints:

			-231 <= x <= 231 - 1
	*/
	public static void main(String[] args) {
		int x01 = 123;
		int x02 = -123;
		int x03 = 120;
		int x04 = 0;
		int x05 = -5;
		int x06 = 2147483647;
		int x07 = -2147483648;
		
		
		System.out.println("01 : " + Solution01.reverse(x01));
		System.out.println("02 : " + Solution01.reverse(x02));
		System.out.println("03 : " + Solution01.reverse(x03));
		System.out.println("04 : " + Solution01.reverse(x04));
		System.out.println("05 : " + Solution01.reverse(x05));
		System.out.println("06 : " + Solution01.reverse(x06));
		System.out.println("07 : " + Solution01.reverse(x07));
	}

}
