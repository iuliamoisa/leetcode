class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lg1 = m-1;
        int lg2 = n-1;
        int k = m+n-1;
        while (lg1 >= 0 && lg2 >= 0) {
            if (nums1[lg1] > nums2[lg2]) {
                nums1[k] = nums1[lg1];
                lg1--;
            } else {
                nums1[k] = nums2[lg2];
                lg2--;
            }
            k--;
        }

        while (lg2 >= 0) {
            nums1[k] = nums2[lg2];
            lg2--;
            k--;
        }
    }
}
