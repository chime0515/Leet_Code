
public class Linked_List_Cycle_II {

	public static void main(String[] args) {

		//int[] a={1,2,3,4,5,6,7,8,9};
		int[] a={1};
		ListNode head=insert(a);
		ListNode ans=detectCycle(head);
		System.out.println("ANS:" +ans.value);

	}

	static public ListNode detectCycle(ListNode head){
		
		if(head==null || head.next==null) return null;
		
		ListNode p1=head;
		ListNode p2=head;
		
		while(true){
			if(p2!=null || p2.next!=null) return null;
			// Loop exists;
			p1=p1.next;
			p2=p2.next.next;
			if(p1==p2) break;
		}
		//if(p1==null || p2==null) return null;
		System.out.println("123");
		p1=head;
		while(p1!=p2){
			p1=p1.next;
			p2=p2.next;
		}
		
		return p2;
	}
	public static ListNode insert(int[] a){
		ListNode head=new ListNode(a[0]);
		ListNode cur=head;
		for(int i=1; i<a.length; i++){
			ListNode tmp=new ListNode(a[i]);
			cur.next=tmp;
			cur=cur.next;
		}
		
		//Make a loop to #4 here;
		cur.next=head;
		
		print(head, 10);
		return head;
	}
	
	public static void print(ListNode head, int size){
		ListNode tmp=head;
		for(int i=0; i<size; i++){
			System.out.print(tmp.value +"->");
			if(tmp.next!=null)
				tmp=tmp.next;
			else break;
		}
		System.out.println();
	}
}
class ListNode{
	int value;
	ListNode next;
	ListNode(int v){
		this.value=v;
		this.next=null;
	}
}
