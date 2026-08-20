class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n - 1;
        for (int i = length; i >= 0; i--) {
            if (m > 0 && (n == 0 || nums1[m - 1] >= nums2[n - 1])) {
                nums1[i] = nums1[m - 1];
                m--;
            } else {
                nums1[i] = nums2[n - 1];
                n--;
            }           
        }
    }
}
