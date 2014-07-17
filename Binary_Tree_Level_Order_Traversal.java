
public class Binary_Tree_Level_Order_Traversal {

    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        if(root==null)  return result;
        
        LinkedList<TreeNode> qu=new LinkedList<TreeNode>();
        qu.add(root);
        
        while(!qu.isEmpty()){
            int size=qu.size();
            ArrayList<Integer> al=new ArrayList<Integer>();
            for(int i=0; i<size; i++){
                TreeNode tmp=qu.remove(0);
                al.add(tmp.val);
                
                if(tmp.left!=null) qu.add(tmp.left);
                if(tmp.right!=null) qu.add(tmp.right);
            }
            result.add(al);
        }
         
        return result; 
    }
}
