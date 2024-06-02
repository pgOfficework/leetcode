package linkedList;

import easy.ListNode;

/*#1290 Convert Binary Number in a Linked List to Integer
Category	Difficulty	Likes	Dislikes
algorithms	Easy (81.41%)	4109	156
Tags
Companies
Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

The most significant bit is at the head of the linked list.

 

Example 1:


Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10
Example 2:

Input: head = [0]
Output: 0
 

Constraints:

The Linked List is not empty.
Number of nodes will not exceed 30.
Each node's value is either 0 or 1.
*/public class ConvertBinaryNumberInLinkedListToInteger {
	
	public static int getDecimalValue(ListNode head) {
		
		StringBuilder str =new StringBuilder();
		do{
			str.append(head.val);
			head=head.next;
		}while (head!=null);
		return Integer.parseInt(str.toString(),2);

	}

	public static void main(String[] args) {
		ListNode headA1 = new ListNode(1);
		ListNode headA2 = new ListNode(0);
		ListNode headA3 = new ListNode(1);
		ListNode headA4 = new ListNode(0);
		
		headA1.next = headA2;
		headA2.next = headA3;
		headA3.next = headA4;
		
		System.out.println(getDecimalValue(headA1));

	}

}
