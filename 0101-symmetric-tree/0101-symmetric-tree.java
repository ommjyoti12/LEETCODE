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
        boolean solve(TreeNode leftn,TreeNode rightn){
            if(leftn==null && rightn==null) return true;

        if((leftn==null && rightn!=null) || (leftn!=null && rightn==null)) return false;

        if(leftn.val==rightn.val){
            boolean l=solve(leftn.left,rightn.right);
            boolean r=solve(leftn.right,rightn.left);

            return l &&r;
        }
        return false;
    }
    public boolean isSymmetric(TreeNode root) {
     return     solve(root.left,root.right);
    }
}