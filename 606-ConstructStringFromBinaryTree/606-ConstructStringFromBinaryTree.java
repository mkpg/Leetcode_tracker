// Last updated: 7/8/2026, 4:47:35 PM
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
class Solution {
    public String tree2str(TreeNode root) {
        if(root == null) return "";
        StringBuilder a = new StringBuilder();
        bString(root,a);
        return a.toString();
    }
    private void bString(TreeNode Node,StringBuilder a){
        if(Node ==null) return;
        a.append(Node.val);
        if(Node.left !=null || Node.right != null){
            a.append("(");
            bString(Node.left,a);
            a.append(")");
        }
        if(Node.right!=null){
            a.append("(");
            bString(Node.right,a);
            a.append(")");
        }
    }
}