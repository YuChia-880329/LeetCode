package problem_0006_zigzagConversion;

public class Main {

	
	/*
	 	The string "PAYPALISHIRING" is written in a zigzag pattern on a given number
	 	of rows like this: (you may want to display this pattern in a fixed font for 
	 	better legibility)
	 	
	 		P   A   H   N
			A P L S I I G
			Y   I   R
			
		And then read line by line: "PAHNAPLSIIGYIR"

		Write the code that will take a string and make this conversion given a number 
		of rows:
		
			string convert(string s, int numRows);
			
			
		-----------------------------------------------------------------------
		
		
		Constraints:

			1 <= s.length <= 1000
			s consists of English letters (lower-case and upper-case), ',' and '.'.
			1 <= numRows <= 1000
	 */
	public static void main(String[] args) {
		
		String s01 = "PAYPALISHIRING";
		int numRows01 = 3;
		
		
		String s02 = "PAYPALISHIRING";
		int numRows02 = 4;
		
		
		String s03 = "A";
		int numRows03 = 1;
		
		
		String s04 = "PAYPALISHIRING";
		int numRows04 = 30;
		
		
		String s05 = "PAYPALISHIRING";
		int numRows05 = 1;
		
		
		System.out.println("01 : " + Solution01.convert(s01, numRows01));
		System.out.println("02 : " + Solution01.convert(s02, numRows02));
		System.out.println("03 : " + Solution01.convert(s03, numRows03));
		System.out.println("04 : " + Solution01.convert(s04, numRows04));
		System.out.println("05 : " + Solution01.convert(s05, numRows05));
		
		
		System.out.println("========================================");
		
		
		System.out.println("01 : " + Solution02.convert(s01, numRows01));
		System.out.println("02 : " + Solution02.convert(s02, numRows02));
		System.out.println("03 : " + Solution02.convert(s03, numRows03));
		System.out.println("04 : " + Solution02.convert(s04, numRows04));
		System.out.println("05 : " + Solution02.convert(s05, numRows05));
	}

}
