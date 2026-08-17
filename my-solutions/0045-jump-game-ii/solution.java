class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int count = 0;
        int curIdx = 0;
        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            index = Math.max(i + nums[i], index);
            
            if (curIdx == i) {
                curIdx = index;
                count++;
            }
            
            if (curIdx >= n - 1) {
                break;
            }
        }
        
        return count;
    }
}
