package problem_0006_zigzagConversion;

public class Solution01 {
	
	/*
	 	s.length() : n
	 	numRows : m
	 	
	 	Time Complexity : O(n+m)
	*/
	public static String convert(String s, int numRows) {
		
		if(numRows==1 || s.length()<=numRows)
			return s;
        
		StringBuilder[] sbs = new StringBuilder[numRows];
		
		for(int i=0; i<numRows; i++) {
			sbs[i] = new StringBuilder();
		}
		
		int index = 0;
		while(index < s.length()) {
			
			for(int i=0; i<numRows && index<s.length(); i++, index++) {
				sbs[i].append(s.charAt(index));
			}
			
			for(int i=numRows-2; i>0 && index<s.length(); i--, index++) {
				sbs[i].append(s.charAt(index));
			}
		}
		
		for(int i=1; i<numRows; i++) {
			sbs[0].append(sbs[i]);
		}
		return sbs[0].toString();
    }
}
