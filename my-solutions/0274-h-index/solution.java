class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int h = 0;
        int answer = 0;
        while(h <= 1000) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (h <= citations[i]) {
                    count++;
                }
            }
            
            if (count >= h) {
                answer = h;
            }
            h++;
        }
        return answer;
    }
}
