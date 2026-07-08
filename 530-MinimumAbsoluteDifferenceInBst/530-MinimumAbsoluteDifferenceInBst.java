// Last updated: 7/8/2026, 4:47:42 PM
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
    int min = Integer.MAX_VALUE;
    Integer pre = null;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return min;
    }
    public void inorder(TreeNode root){
        if(root==null) return ;
        inorder(root.left);
        if(pre!=null){
            min  = Math.min(min,root.val-pre);
        }
        pre = root.val;
        inorder(root.right);
    }
}

// class Solution {
//     int min = Integer.MAX_VALUE;
//     public int getMinimumDifference(TreeNode root) {
       
//         if(root==null){
//             return min;
//         }
//         if(root.left != null){
//             if(Math.abs(root.val - root.left.val) < min) min = Math.abs(root.val - root.left.val);
//             if(root.left.left != null){
//                 if(Math.abs(root.val - root.left.left.val) < min) min = Math.abs(root.val - root.left.left.val);
//             }
//             if(root.left.right != null){
//                 if(Math.abs(root.val - root.left.right.val) < min) min = Math.abs(root.val - root.left.right.val);
//             }


//         }
//         if(root.right != null){
//             if(Math.abs(root.val - root.right.val) < min) min = Math.abs(root.val - root.right.val);
//             if(root.right.left != null){
//                 if(Math.abs(root.val - root.right.left.val) < min) min = Math.abs(root.val - root.right.left.val);
//             }
//             if(root.right.right != null){
//                 if(Math.abs(root.val - root.right.right.val) < min) min = Math.abs(root.val - root.right.right.val);
//             }
//         }
//         getMinimumDifference(root.left);
//         getMinimumDifference(root.right);

//         return min;

        
//     }
// }

