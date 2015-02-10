
public class Merge_K_Sorted_Lists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode mergeKLists(List<ListNode> lists) {
        if(lists.size()==0)
            return null;
            
        int e=lists.size()-1;
        
        while(e>0){
            int b=0;
            while(b<e){
                lists.set(b, merge2Lists(lists.get(b), lists.get(e)) );
                b++;
                e--;
            }

        }
        
        return lists.get(0);
        
    }
    
    public static ListNode merge2Lists(ListNode l1, ListNode l2){
        
        if(l1==null || l2==null)
            return l1==null? l2:l1;
        
        ListNode fh=new ListNode(-1);
        ListNode p=fh;    
        
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                p.next=l1;
                l1=l1.next;
            }
            else{
                p.next=l2;
                l2=l2.next;
            }
            p=p.next;
        }
        
        if(l1==null) p.next=l2;
        if(l2==null) p.next=l1;
        
        return fh.next;
    }
}
