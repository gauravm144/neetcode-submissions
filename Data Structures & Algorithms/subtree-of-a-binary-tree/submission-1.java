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

// class Solution {  
//     boolean ans=false;
//     public boolean isSubtree(TreeNode root, TreeNode subRoot) {
//         if(ans==true)
//         return true;
//         if(root==null&&subRoot==null)
//         return true;
//         if(root==null&&subRoot!=null)
//         return false;
//         if(root!=null&&subRoot==null)
//         return false;
//         if(root.val==subRoot.val){
//             ans=check(root,subRoot);
//         }
//         return isSubtree(root.left,subRoot)|isSubtree(root.right,subRoot);
//     }
//     public boolean check(TreeNode root, TreeNode subRoot){
//         if(root==null&&subRoot==null)
//         return true;
//         if(root==null&&subRoot!=null)
//         return false;
//         if(root!=null&&subRoot==null)
//         return false;
//         if(root.val!=subRoot.val){
//             return false;
//         }
//         return check(root.left,subRoot.left)&check(root.right,subRoot.right);
//     }
// }

class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // If the main tree is empty, we can't find a subRoot
        if (root == null) return false;
        
        // 1. Check if the current tree starting at 'root' matches 'subRoot'
        // 2. OR check if 'subRoot' exists in the left subtree
        // 3. OR check if 'subRoot' exists in the right subtree
        return check(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean check(TreeNode r, TreeNode s) {
        // If both reach null at the same time, they match
        if (r == null && s == null) return true;
        // If only one is null, or values don't match, they don't match
        if (r == null || s == null || r.val != s.val) return false;
        
        // Both values match, so check their children
        return check(r.left, s.left) && check(r.right, s.right);
    }
}
