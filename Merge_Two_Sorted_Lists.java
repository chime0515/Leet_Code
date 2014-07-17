
public class Merge_Two_Sorted_Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode p1=l1;
        ListNode p2=l2;
        
        ListNode head=new ListNode(0);
        ListNode tmp=head;
        
        while(p1!=null && p2!=null){
            if(p1.val<p2.val){
                tmp.next=p1;
                p1=p1.next;
            }
            else{
                tmp.next=p2;
                p2=p2.next;
            }
            
            tmp=tmp.next;
        }
        
        if(p1!=null) 
            tmp.next=p1;
        else 
            tmp.next=p2;
        
        return head.next;
    }
	
}
