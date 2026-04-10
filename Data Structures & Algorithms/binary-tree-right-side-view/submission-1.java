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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        if(root==null)
        return ans;
        
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            boolean isadded=false;
            while(size!=0){
                TreeNode tmp=q.poll();
                if(isadded==false)
                ans.add(tmp.val);
                isadded=true;
                if(tmp.right!=null)
                q.offer(tmp.right);
                if(tmp.left!=null)
                q.offer(tmp.left);
                size--;
            }
        }
        
        return ans;
    }
}
