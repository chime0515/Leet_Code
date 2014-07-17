/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
 
public class Populating_Next_Right_Pointers {
    public void connect(TreeLinkNode root) {
        if(root==null) return;
    
        LinkedList<TreeLinkNode> qu=new LinkedList<TreeLinkNode>();
        qu.add(root);
        
        while(!qu.isEmpty()){
            int size=qu.size();
            
            for(int i=0; i<size; i++){
                TreeLinkNode tmp=qu.remove(0);
            
                if(i==size-1)
                    tmp.next=null;
                else
                    tmp.next=qu.peek();
            
                if(tmp.left!=null)
                    qu.add(tmp.left);
                if(tmp.right!=null)
                    qu.add(tmp.right);
            }
        }
    }
 
}