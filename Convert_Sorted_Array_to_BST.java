
public class Convert_Sorted_Array_to_BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public class Solution {
	    public TreeNode sortedArrayToBST(int[] num) {
	        
	        TreeNode head=null;
	        head=sol(num, 0, num.length-1);
	        return head;
	    }
	    
	    public TreeNode sol(int[] a, int b, int e){
	        
	        if(b>e) return null;
	        
	        int mid=b+(e-b)/2;
	        
	        TreeNode tmp=new TreeNode(a[mid]);
	        
	        tmp.left=sol(a, b, mid-1);
	        tmp.right=sol(a, mid+1, e);
	        
	        return tmp;
	    }
	}
}
