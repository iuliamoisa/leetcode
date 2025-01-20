class NumArray {
    int[] numsArray;

    public NumArray(int[] nums) {
        numsArray = new int[nums.length];
        numsArray[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            numsArray[i] = numsArray[i-1] + nums[i] ;
        }
    }
    
    public int sumRange(int left, int right) {
       if(left == 0) return numsArray[right];
       return numsArray[right] - numsArray[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
