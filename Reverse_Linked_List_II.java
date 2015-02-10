public class Reverse_Linked_List_II {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode reverseBetween(ListNode head, int m, int n) {

		if (head == null)
			return head;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode pre = dummy;
		int i = 1;

		while (pre != null && i < m) {
			pre = pre.next;
			i++;
		}

		if (i < m)
			return head;

		ListNode mNode = pre.next;
		ListNode cur = mNode.next;
		while (cur != null && i < n) {
			ListNode next = cur.next;
			cur.next = pre.next;
			pre.next = cur;
			mNode.next = next;
			cur = next;
			i++;
		}

		return dummy.next;
	}
}
