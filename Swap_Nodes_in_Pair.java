
public class Swap_Nodes_in_Pair {

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) {
	 *         val = x;
	 *         next = null;
	 *     }
	 * }
	 */
	public class Solution {
	    public ListNode swapPairs(ListNode head) {
	        
	        if(head==null || head.next==null) return head;
	     
	        ListNode cur=head;
	        ListNode run=head.next;
	        
	        while(true){
	            //Swap here
	            int tmp=cur.val;
	            cur.val=run.val;
	            run.val=tmp;
	            
	            if(cur.next.next!=null)
	                cur=cur.next.next;
	            else break;
	            if(cur.next!=null)
	                run=cur.next;
	            else break;
	            
	        }
	        
	        
	        return head;
	    }
	}
}
