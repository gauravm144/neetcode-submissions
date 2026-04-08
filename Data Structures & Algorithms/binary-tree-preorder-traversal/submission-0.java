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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        find(root,ans);
        return ans;
    }
    void find(TreeNode root,List<Integer>ans){
        if(root==null)
        return;
        ans.add(root.val);
        find(root.left,ans);
        // System.out.println(root.val);
        find(root.right,ans);
    }
}