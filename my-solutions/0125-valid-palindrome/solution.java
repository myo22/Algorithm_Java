class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        String str = "";
        for (int i = 0; i < n; i++) {
            char a = s.charAt(i);
            if (a >= 'a' && a <= 'z') {
                str += a;
            } else if (a >= 'A' && a <= 'Z') {
                str += (char)(a + 32);
            } else if (a >= '0' && a <= '9') {
                str += a;
            }
        }
        
        int start = 0;
        int end = str.length() - 1;
        while (start <= end) {
            if (str.charAt(start++) != str.charAt(end--)) {
                return false;
            }
        }
        
        return true;
    }
}
