class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        
        int sIdx = 0;
        int tIdx = 0;
        
        while (sIdx < s.length() && tIdx < t.length()) {
            if (s.charAt(sIdx) == t.charAt(tIdx)) {
                sIdx++; // s의 다음 문자를 찾기 위해 포인터 이동
            }
            tIdx++; // t는 무조건 다음 문자로 이동
        }
        
        // s의 모든 문자를 순서대로 다 찾았다면 sIdx가 s.length()와 같아짐
        return sIdx == s.length();
    }
}

