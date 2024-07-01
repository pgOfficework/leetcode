package linkedList;

import easy.ListNode;

public class PalindromeLinkedList {

    public static boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null)
            return true;
//		if (head.next.next == null && head.val != head.next.val)
//			return false;

        int count = 1;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        ListNode next = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            count++;
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
//		if(fast == null) {
//			count--;
//		}

        System.out.println(count);
        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            if (slow.val == prev.val) {
                slow = slow.next;
                prev = prev.next;
            } else {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        ListNode headA1 = new ListNode(1);
        ListNode headA2 = new ListNode(2);
        ListNode headA3 = new ListNode(3);
        ListNode headA4 = new ListNode(4);
        ListNode headA5 = new ListNode(5);
        ListNode headA6 = new ListNode(4);
        ListNode headA7 = new ListNode(3);
        ListNode headA8 = new ListNode(2);
        ListNode headA9 = new ListNode(1);

        headA1.next = headA2;
        headA2.next = headA3;
        headA3.next = headA4;
        headA4.next = headA5;
        headA5.next = headA6;
        headA6.next = headA7;
        headA7.next = headA8;
        headA8.next = headA9;
        System.out.println("true : " + isPalindrome(headA1));

        headA1 = new ListNode(1);
        headA2 = new ListNode(2);
        headA3 = new ListNode(2);
        headA4 = new ListNode(1);

        headA1.next = headA2;
        System.out.println("false : " + isPalindrome(headA1));

        headA2.next = headA3;
        headA3.next = headA4;
        System.out.println("true : " + isPalindrome(headA1));

        headA1 = new ListNode(1);
        headA2 = new ListNode(0);
        headA3 = new ListNode(1);

        headA1.next = headA2;
        headA2.next = headA3;
        System.out.println("true : " + isPalindrome(headA1));

    }

}
