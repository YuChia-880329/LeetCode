package problem_0002_addTwoNumbers;

import java.util.Arrays;

public class Main {

	/*
	 	You are given two non-empty linked lists representing two non-negative integers. 
	 	The digits are stored in reverse order, and each of their nodes contains a single 
	 	digit. Add the two numbers and return the sum as a linked list.

		You may assume the two numbers do not contain any leading zero, except the number 0 
		itself.
		
		
		------------------------------------------------------------------------------------
		
		
		Constraints:

			The number of nodes in each linked list is in the range [1, 100].
			0 <= Node.val <= 9
			It is guaranteed that the list represents a number that does not have leading zeros.
	 */
	public static void main(String[] args) {
		
		int[] l101 = {2, 4, 3};
		int[] l201 = {5, 6, 4};
		
		
		int[] l102 = {0};
		int[] l202 = {0};
		
		
		int[] l103 = {9, 9, 9, 9, 9, 9, 9};
		int[] l203 = {9, 9, 9, 9};
		
		
		System.out.println("01 : " + Arrays.toString(ListNodeDealer.read(Solution01.addTwoNumbers(ListNodeDealer.produce(l101), ListNodeDealer.produce(l201)))));
		System.out.println("02 : " + Arrays.toString(ListNodeDealer.read(Solution01.addTwoNumbers(ListNodeDealer.produce(l102), ListNodeDealer.produce(l202)))));
		System.out.println("03 : " + Arrays.toString(ListNodeDealer.read(Solution01.addTwoNumbers(ListNodeDealer.produce(l103), ListNodeDealer.produce(l203)))));
	}

}
