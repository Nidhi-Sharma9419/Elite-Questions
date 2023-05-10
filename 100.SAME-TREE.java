class Solution {

    public boolean isSameTree(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) return true;
        if (n1 == null || n2 == null) return false;
        if (n1.val != n2.val) return false;

        return isSameTree(n1.left,n2.left) && isSameTree(n1.right,n2.right);       
    } 
}
