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
    int dia=0;
    public int diameterOfBinaryTree(TreeNode root) {
      getdiameter(root);
      return dia;  
    }
    public int getdiameter(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=getdiameter(root.left);
        int r=getdiameter(root.right);
        dia= Math.max(dia,(l+r));
        return Math.max(l,r)+1;
    }
}