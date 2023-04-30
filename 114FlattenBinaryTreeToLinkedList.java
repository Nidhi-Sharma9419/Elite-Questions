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
    public void flatten(TreeNode root) {

        //make left of parent to right, parent right link to parent left
        //1. leftterminal->right = root->right
        //   return rightterminal
        //2. root.right = root.left
        //3. root.left = null
        linearly(root); // Call the recursive helper function
    }

    private TreeNode linearly(TreeNode root) {
    
        if (root == null) { // Base case: if the current node is null, return null
            return null;
        }
    
       
        TreeNode leftTerminal = linearly(root.left);
        TreeNode rightTerminal = linearly(root.right);
    
        
        if (leftTerminal != null) {
            leftTerminal.right = root.right; 
            root.right = root.left; 
            root.left = null;
        }
    
        
        if (rightTerminal != null) {
            return rightTerminal;
        }
    
       
        if (leftTerminal != null) {
            return leftTerminal;
        }
    
       
        return root;
        
    }
}
