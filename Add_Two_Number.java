
public class Add_Two_Number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1==null && l2==null)
            return null;
        if(l1==null || l2==null)
            return l1==null? l2: l1;
        
        ListNode fh=new ListNode(0);
        int carry=0;
        ListNode cur=fh;
        
        while(l1!=null && l2!=null){
            ListNode tmp=new ListNode(0);
            
            tmp.val=l1.val+l2.val+carry;
            carry=tmp.val/10;
            tmp.val%=10;
            cur.next=tmp;
            cur=cur.next;
            l1=l1.next;
            l2=l2.next;
        }
        
        if(l1!=null){
            while(l1!=null){
                ListNode tmp=new ListNode(0);
                tmp.val=l1.val+carry;
                carry=tmp.val/10;
                tmp.val%=10;
                cur.next=tmp;
                cur=cur.next;
                l1=l1.next;
            }
        }
        if(l2!=null){
            while(l2!=null){
                ListNode tmp=new ListNode(0);
                tmp.val=l2.val+carry;
                carry=tmp.val/10;
                tmp.val%=10;
                cur.next=tmp;
                cur=cur.next;
                l2=l2.next;
            }
        }
        
        if(carry==1){
            cur.next=new ListNode(1);
            cur=cur.next;
        }
        return fh.next;
    }
	
}
