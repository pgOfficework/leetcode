package linkedList;

import easy.ListNode;

public class ReverseLinkedList {
	
public static ListNode reverseList(ListNode head) {
	
	if(head==null || head.next==null) return head;
	
	ListNode prev = null;
	
	while (head!=null) {
		ListNode next=head.next;
		head.next=prev;
		prev=head;
		head=next;
		
	}
	
	return prev;
        
    }

	public static void main(String[] args) {

		ListNode headA1 = new ListNode(2);
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
		
		headA1= reverseList(headA1);
//		System.out.println(headA1==null);
		while (headA1!=null) {
			System.out.println(headA1.val);
			headA1=headA1.next;
		}

	

	}

}
