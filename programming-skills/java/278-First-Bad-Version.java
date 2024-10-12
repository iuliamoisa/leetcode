/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
 public int firstBadVersion(int n) {
            int left = 1;
            int right = n;
            while(left < right){
                int mid = left + (right-left)/2; // make sure to not exceed the int limit
          /*
          This version ensures that you are only adding a smaller value ((right - left) / 2) to left, 
          thus preventing the sum from exceeding the int limit.

          right - left gives the distance between the left and right pointers.
          Dividing this distance by 2 and adding it to left gives you the middle point without risking overflow
          */
                if(isBadVersion(mid)){
                    right = mid;
                } else {
                    left = mid+1;
                }
            }
        return left;
    }
// time limit exceeded  
    //     public int firstBadVersion(int n) {
    //         int left = 1;
    //         int right = n;
    //         while(left < right){
    //             int mid = (left+right)/2; // This formula works well for small numbers, 
                        // but when left and right are very large, left + right can exceed the maximum value 
                        //that an int can store, leading to integer overflow.
    //             if(isBadVersion(mid)){
    //                 right = mid;
    //             } else {
    //                 left = mid+1;
    //             }
    //         }
    //     return left;
    // }
    // O(n) -> bad version
    // public int firstBadVersion(int n) {
    //     for(int i = 1; i <= n; i++){
    //         if(isBadVersion(i)){
    //             return i;
    //         }
    //     }
    //     return 0;
    // }
}
