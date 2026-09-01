class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        
        int sIndex = 0;
        for (int tIndex = 0; tIndex < t.length(); tIndex++) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            if (sIndex == s.length()) {
                return true;
            }
        }
        return false;
    }
}

