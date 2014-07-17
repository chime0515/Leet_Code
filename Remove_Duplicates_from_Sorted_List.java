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
public class Remove_Duplicates_from_Sorted_List {

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        
        ListNode cur=head;
        ListNode run=head;
        
        while(cur!=null){
            run=cur.next;
            while(run!=null && run.val==cur.val){
                run=run.next;
            }
            
            cur.next=run;
            cur=run;
        }
        
        return head;
    }
}
