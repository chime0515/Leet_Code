import java.util.List;


public class Binary_Tree_Postorder_Traversal {

	public class Solution {
	    ArrayList<Integer> aa=new ArrayList<Integer>();
	    public ArrayList<Integer> postorderTraversal(TreeNode root) {
	        
	        if(root!=null){
				  postorderTraversal(root.left);  
				  postorderTraversal(root.right);
			      aa.add(root.val);
	        }
	        return aa;
	    }
	}

}
