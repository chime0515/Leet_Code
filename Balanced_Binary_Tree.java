
public class Balanced_Binary_Tree {

	/**
	 * Definition for binary tree
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	    
	    public boolean isBalanced(TreeNode root) {
	     
	        if(root==null) return true; 
	        if(checkDepth(root)==-1) return false;
	        else return true;
	    }
	    
	    public static int checkDepth(TreeNode root){
			if(root==null)
				return 0;
			
			int ln=checkDepth(root.left);
			if(ln==-1) return -1;
			
			int rn=checkDepth(root.right);
			if(rn==-1) return -1;
			
			if(Math.abs(ln-rn)>1) return -1;
			else return Math.max(ln,rn)+1;
			
		  }
	
}
