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
    boolean ans=true;
    public boolean isBalanced(TreeNode root) {
        find(root);
        return ans;
    }
    public int find(TreeNode root){
        if(root==null)
        return 0;
        if(ans==false)
        return 0;
        int lft=find(root.left);
        int rgt=find(root.right);
        if(Math.abs(lft-rgt)>1)
        ans=false;
        return 1+Math.max(lft,rgt);

    }
}
