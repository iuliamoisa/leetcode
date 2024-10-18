class Solution {
    public boolean containsDuplicate(int[] nums) {
        // beats 52% runtime
        HashSet<Integer> list = new HashSet<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(list.contains(nums[i])) return true; // O(1)
            list.add(nums[i]);
        }
        return false;
        // runtime beats 31% O(n log n)
        // Arrays.sort(nums);
        // int n = nums.length;
        // for(int i = 0; i < n-1; i++){
        //     if(nums[i] == nums[i+1]){
        //         return true;
        //     }
        // }
        // return false;


        // O(n^2) --> time limit exceeded
        // int n = nums.length;
        // for (int i = 0; i < n - 1; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if (nums[i] == nums[j])
        //             return true;
        //     }
        // }
        // return false;
    }
}
