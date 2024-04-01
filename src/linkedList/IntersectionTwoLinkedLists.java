package linkedList;

import easy.ListNode;

//#leetcode problem 160
public class IntersectionTwoLinkedLists {

	public static void main(String[] args) {
		ListNode l1 =new ListNode(4); //listA = [4,1,8,4,5], listB = [5,6,1,8,4,5],
		ListNode l2 =new ListNode(1);
		ListNode l3 =new ListNode(8);
		ListNode l4 =new ListNode(4);
		ListNode l5 =new ListNode(5);
		
		ListNode l6 =new ListNode(5);
		ListNode l7 =new ListNode(6);
		ListNode l8 =new ListNode(1);
		ListNode l9 =new ListNode(8);
		ListNode l10 =new ListNode(4);
		ListNode l11 =new ListNode(5);
		
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;

		l6.next=l7;
		l7.next=l8;
		l8.next=l9;
		l9.next=l10;
		l10.next=l11;

	}

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		return headB;
	
		
	}

}
