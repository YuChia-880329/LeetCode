package problem_0006_zigzagConversion;

public class Solution02 {

	/*
 		s.length() : n
 		numRows : m
 	
 		Time Complexity : O(n+m)
	*/
	public static String convert(String s, int numRows) {
		
		if(numRows==1 || s.length()<=numRows)
			return s;
		
		int len = s.length();
		int num = 2*numRows - 2;
		
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<numRows; i++) {
			
			int f = 0;
			while(f < len) {
				if(f+i < len)
					sb.append(s.charAt(f+i));
				else {
					f += num;
					break;
				}

				
				if((i!=0 && i!=numRows-1) && (f+num-i) < len)
					sb.append(s.charAt(f+num-i));
				
				f += num;
			}
		}

		return sb.toString();
	}
}
