package linkedList;

import java.util.Currency;

import easy.ListNode;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
public class ReorderList {
    public static void reorderList(ListNode head) {

        ListNode slow = head.next;
        ListNode fast = head.next.next;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode middle = slow;
        ListNode secondHalf = reverseList(slow);
        ListNode reorderList = head;   //1
        slow.next = null;

        ListNode temp1;
        ListNode temp2;

        while (reorderList.next != null && secondHalf.next != null) {
            temp1 = reorderList.next;  //2
            reorderList.next = secondHalf;  //5

            temp2 = secondHalf.next;  //4
            secondHalf.next = temp1; //2


            reorderList = temp1; //2
            secondHalf = temp2; //4

        }


//		System.out.println("original");
        do {
            System.out.println(head.val);
            head = head.next;
        } while (head != null);

    }

    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l7 = new ListNode(7);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;

        ListNode head = l1;
        do {
            System.out.println(head.val);
            head = head.next;
        } while (head != null);
        System.out.println();

        reorderList(l1);

    }
}