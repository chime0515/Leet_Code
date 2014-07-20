
public class Same_Tree {


	public static void main(String[] args) {


	}
	/**
	 * Definition for binary tree
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	public boolean isSameTree(TreeNode p, TreeNode q) {
	    
        if(p==null && q==null) return true;
        if(p==null || q==null) return
    
        LinkedList<TreeNode> qu1=new LinkedList<TreeNode>();
        LinkedList<TreeNode> qu2=new LinkedList<TreeNode>();
        
        qu1.add(p);
        qu2.add(q);
        
        while(!qu1.isEmpty() || !qu2.isEmpty()){
            TreeNode tmp1=qu1.remove(0);
            TreeNode tmp2=qu2.remove(0);
            if(tmp1.val != tmp2.val)
                return false;
            
            if(tmp1.left!=null) qu1.add(tmp1.left);
            if(tmp1.right!=null) qu1.add(tmp1.right);
            
            if(tmp2.left!=null) qu2.add(tmp2.left);
            if(tmp2.right!=null) qu2.add(tmp2.right);
        }
        
        return true;
    }
}
