/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
    void preorder(TreeNode root,StringBuffer ans)
    {
        if(root!=null){
            ans.append("("+root.val);
            if(root.left==null && root.right!=null)
                ans.append("()"+root.val);
            
        else
        
            preorder(root.left,ans);
            preorder(root.right,ans);
            ans.append(")");
        }
    }
    public String tree2str(TreeNode root) {
       StringBuffer ans= new StringBuffer();
        if(root==null)
            return ans.toString();
        preorder(root,ans);
        ans.deleteCharAt(0);
        ans.deleteCharAt(ans.length()-1);
        StringBuilder sb = new StringBuilder();
        preOrder(root, sb);
        return sb.toString();
    }
    
    private void preOrder(TreeNode root, StringBuilder sb) {
        if (root == null) return;
        
        sb.append(root.val);
        if (root.left != null) {
            sb.append("(");
            preOrder(root.left, sb);
            sb.append(")");
        }
        
        if (root.right != null) {
            if (root.left == null)
                sb.append("()");
        
            sb.append("(");
            preOrder(root.right, sb); 
            sb.append(")");
        }
    }
}