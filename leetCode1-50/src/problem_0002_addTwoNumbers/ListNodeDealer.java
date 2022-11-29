package problem_0002_addTwoNumbers;

import java.util.ArrayList;
import java.util.List;

public class ListNodeDealer {

	public static ListNode produce(int[] array) {
		ListNode firstNode = new ListNode(array[0]);
		
		ListNode node = firstNode;
		for(int i=1; i<array.length; i++) {
			node.next = new ListNode(array[i]);
			node = node.next;
		}
		
		return firstNode;
	}
	
	public static int[] read(ListNode firstNode) {
		List<Integer> list = new ArrayList<>();
		
		ListNode node = firstNode;
		while(node != null) {
			list.add(node.val);
			node = node.next;
		}
		
		return reverse(list);
	}
	
	private static int[] reverse(List<Integer> list) {
		int[] array = new int[list.size()];
		
		for(int i=0; i<array.length; i++) {
			array[i] = list.get(array.length-1-i);
		}
		return array;
	}
}
