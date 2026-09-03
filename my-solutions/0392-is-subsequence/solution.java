class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        int start = 0;
        int end = t.length();
        for (int i = 0; i < end; i++) {
            if (s.charAt(start) == t.charAt(i)) {
                start++;
            }
            if (start == s.length()) {
                return true;
            }
        }
        return false;
    }
}
