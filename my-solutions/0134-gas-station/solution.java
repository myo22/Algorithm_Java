class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int current = 0;
        int total = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            int distance = gas[i] - cost[i];
            total += distance;
            current += distance;
            if (current < 0) {
                current = 0;
                index = i + 1;                          
            }
        }
        
        return total >= 0 ? index : -1;
    }
}
