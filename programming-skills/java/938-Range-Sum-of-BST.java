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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        if(root == null) return sum;
        
        if(root.val <= high && root.val >= low){
            sum += root.val;
        }
        int s1 = rangeSumBST(root.left, low, high);
        int s2 = rangeSumBST(root.right, low, high);
        sum += s1 + s2;
        return sum;
    }
}
