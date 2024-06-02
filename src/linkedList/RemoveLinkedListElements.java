package linkedList;

import java.util.List;

import easy.ListNode;

/* #203 Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

		 

Example 1:


Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
Example 2:

Input: head = [], val = 1
Output: []
Example 3:

Input: head = [7,7,7,7], val = 7
Output: []
 

Constraints:

The number of nodes in the list is in the range [0, 104].
1 <= Node.val <= 50
0 <= val <= 50*/
public class RemoveLinkedListElements {
	
public static ListNode removeElements(ListNode head, int val) {
		
	if(head==null) return head;
	
		while(head!=null && head.val==val) {
			if(head.next==null)
				return null;
				head=head.next;
			
		}
		
		ListNode current=head;
		
		while (current.next!=null) {

			if(current.next.val!=val) {
				current=current.next;
			}
			else {
				current.next=current.next.next;
			}
		}
		
        return head;
    }

	public static void main(String[] args) {
		ListNode headA1 = new ListNode(1);
		ListNode headA2 = new ListNode(1);
		ListNode headA3 = new ListNode(8);
		ListNode headA4 = new ListNode(4);
		ListNode headA5 = new ListNode(1);
		ListNode headA6 = new ListNode(5);
		ListNode headA7 = new ListNode(6);
		ListNode headA8 = new ListNode(1);
		
		headA1.next=headA2;
		headA2.next=headA3;
		headA3.next=headA4;
		headA4.next=headA5;
		headA5.next=headA6;
		headA6.next=headA7;
		headA7.next=headA8;
		
		headA1= removeElements(headA1, 1);
//		System.out.println(headA1==null);
		while (headA1!=null) {
			System.out.println(headA1.val);
			headA1=headA1.next;
		}

	}

}
