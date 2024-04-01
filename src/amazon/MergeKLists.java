package amazon;

import java.io.IOException;

public class MergeKLists {

	static class ListNode {
		int val;
		ListNode next;

		public ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static void printLinkedList(ListNode node) throws IOException {
		while (node != null) {
		//	System.out.println(node.val);
			node = node.next;

			if (node != null) {
				System.out.println(node.val);
			}
			
		}
	}

	public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return mergeKListsHelper(lists, 0, lists.length - 1);
    }
    
    private static ListNode mergeKListsHelper(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }
        if (start + 1 == end) {
            return merge(lists[start], lists[end]);
        }
        int mid = start + (end - start) / 2;
        ListNode left = mergeKListsHelper(lists, start, mid);
        ListNode right = mergeKListsHelper(lists, mid + 1, end);
        return merge(left, right);
    }
    
    private static ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        
        curr.next = (l1 != null) ? l1 : l2;
        
        return dummy.next;
    }

	public static void main(String[] args) throws IOException {

		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(5);

		ListNode node4 = new ListNode(1);
		ListNode node5 = new ListNode(3);
		ListNode node6 = new ListNode(4);

		ListNode node7 = new ListNode(2);
		ListNode node8 = new ListNode(6);

		node1.next = node2;
		node2.next = node3;

		node4.next = node5;
		node5.next = node6;

		node7.next = node8;

		ListNode[] all = { node1, node4, node7 };

		ListNode llist3 = mergeKLists(all);
		printLinkedList(llist3);

	}

}
