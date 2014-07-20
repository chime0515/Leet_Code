
public class Max_Depth_of_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);
        
        return Math.max(l, r)+1;
        
    }
}
