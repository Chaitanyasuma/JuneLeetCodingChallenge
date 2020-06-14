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
    public TreeNode invertTree(TreeNode root) {
        rec(root);   
        return root;
    }
    public void rec(TreeNode root) {
        if(root == null)
            return;
        if(root.left != null) {
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = temp;
        }
        else if (root.right != null) {
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = temp;   
        }
        rec(root.left);
        rec(root.right);
    }
}