/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) 
    {
        ListNode mid=null;
     if(head==null)
     return null;   
    else
    mid=find_middle(head);
    TreeNode node=new TreeNode(mid.val);
    if(mid==head)
    return node;
    node.left=sortedListToBST(head);
    node.right=sortedListToBST(mid.next);
    mid.next=null;
    return node;
    }
    public ListNode find_middle(ListNode head)
    {
        ListNode pp=null,sp=head,fp=head;
        while(fp!=null && fp.next!=null)
        {
            pp=sp;
            sp=sp.next;
            fp=fp.next.next;
        }
        if(pp!=null)
        pp.next=null;
        return sp;
    }
}
