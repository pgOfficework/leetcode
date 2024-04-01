package easy;

public class MergeTwoSortedLists {
	public static void main(String[] args) {
		ListNode list1 = new ListNode();// 1,2,4
		ListNode l11 = new ListNode();
		ListNode l12 = new ListNode();

		list1.val = 1;
		list1.next = l11;
		l11.val = 3;
		l11.next = l12;
		l12.val = 4;

		ListNode list2 = new ListNode();// {1,3,4};
		ListNode l21 = new ListNode();
		ListNode l22 = new ListNode();
		ListNode l23 = new ListNode();
		list2.val = 1;
		list2.next = l21;
		l21.val = 3;
		l21.next = l22;
		l22.val = 4;
		l22.next=l23;
		l23.val=6;
		
		ListNode list3 = new ListNode();

		ListNode sorted = mergeTwoLists(list1, list2);

		while (sorted.next != null) {
			System.out.println(sorted.val);
			sorted = sorted.next;
		}
		System.out.println(sorted.val);
	}

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode sorted = null;
		ListNode head = null;
		if(list1.next==null) {
			if(list1.val>=0)
			System.out.println(list1==null);
			return list2;
		}
		if(list2.next==null) {
			System.out.println(list2==null);
			return list1;
		}

		while (list1.next != null || list2.next != null) {
			if (list1.val <= list2.val) {
				ListNode node = new ListNode(list1.val);
				if (sorted == null) {
					sorted = node;
					head = sorted;
					list1 = list1.next;
				} else {
					sorted.next = node;
					sorted = sorted.next;
					list1 = list1.next;
				}
			}

			else {
				ListNode node = new ListNode(list2.val);
				if (sorted == null) {
					sorted = node;
					head = sorted;
					list2 = list2.next;
				} else {
					sorted.next = node;
					sorted = sorted.next;
					list2 = list2.next;
				}

			}
		}
		if(list1.next==null) {
			sorted.next=list2;
			sorted=sorted.next;
		}
		if(list2.next==null) {
			sorted.next=list1;
			sorted=sorted.next;
		}
		return head;

	}

}
