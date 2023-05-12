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
    List<Integer> list = new ArrayList<>();
    int mini = Integer.MAX_VALUE;
    TreeNode prev = null;
    public int minDiffInBST(TreeNode root) {
        /*solve(root);
        //int minT=Integer.MAX_VALUE;
        int mini = Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++){
            mini = Math.min(mini,(list.get(i) - list.get(i-1)));
        }
        return mini;*/
        if(root==null) return 0;
        minDiffInBST(root.left);
        if(prev!=null){
            mini = Math.min(mini, root.val-prev.val);

        }
        prev = root;
        minDiffInBST(root.right);

        return mini;
    }
    public void solve(TreeNode root){
        if (root==null) return;
        solve(root.left);
        list.add(root.val);
        solve(root.right);
        
    }
}
