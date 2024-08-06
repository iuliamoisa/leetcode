// beats 98% 
class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length == 1) return true;
        boolean decreasing = false;
        boolean increasing = false;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i+1]){
                increasing = true;
            }
            else if(nums[i] > nums[i+1]){
                decreasing = true;
            }
        if(increasing && decreasing) return false; // imposibil sa creasca si sa si descreasca => nu e monoton
        }
       return true;

    }
}



/////////////////////////
// beats 68%
// class Solution {
//     public boolean isMonotonic(int[] nums) {
//         if(nums.length == 1) return true;
//         int ok = 0; // 1=crescator; -1=descrescator
//         for(int i = 0; i < nums.length - 1; i++){
//             if(nums[i] < nums[i+1]){
//                 if(ok == 0) ok = 1;
//                 else{
//                     if(ok == -1) return false;
//                 }
//             }
//             else if(nums[i] > nums[i+1]){
//                 if(ok == 0) ok = -1;
//                 else {
//                     if(ok == 1) return false;
//                 }
//             }
//         }
//        return true;

//     }
// }
