package problem_0002_addTwoNumbers;

public class Solution01 {

	/*
	  	The number of nodes for l1 : n
	  	The number of nodes for l2 : m
	  	
	  	Time Complexity : O(n+m)
	 */
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int num = l1.val +  l2.val;
        int carry = num/10;
        num %= 10;

        ListNode ans = new ListNode(num);

        ListNode listNode = ans;
        l1 = l1.next;
        l2 = l2.next;
        while(l1!=null || l2!=null){
            int n1 = (l1!=null) ? l1.val : 0;
            int n2 = (l2!=null) ? l2.val : 0;
            num = n1 + n2 + carry;
            carry = num/10;
            num %= 10;
            listNode.next = new ListNode(num);
            

            listNode = listNode.next;
            l1 = (l1!=null) ? l1.next : l1;
            l2 = (l2!=null) ? l2.next : l2;
        }

        if(carry != 0)
            listNode.next = new ListNode(carry);

        return ans;
    }
}
