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
    public TreeNode createBST(int[] nums, int left, int right){
        if(left > right) return null;
        int middle = (left + right) / 2;
        TreeNode root = new TreeNode();
        root.val = nums[middle];
        root.left = createBST(nums, left, middle-1);
        root.right = createBST(nums, middle+1, right);
        return root;

    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums, 0, nums.length-1);
    }
}
