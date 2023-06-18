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
    
    private Integer prev = null;
    
    public boolean isValidBST(TreeNode root) { 
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        System.out.println(ans);
        
        for (int i=1 ; i < ans.size(); i++){
            if (ans.get(i) <= ans.get(i-1)) return false;
        }
        return true;
                
    }


    private void inorder (TreeNode root,ArrayList ans){
        if (root != null){
            inorder(root.left,ans);
            ans.add(root.val);
            inorder(root.right,ans);
        }
    }
}
