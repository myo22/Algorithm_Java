class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String prefix = strs[0];
        for (int i = 0; i < strs.length - 1; i++) {
            for (int j = 0; j < prefix.length(); j++) {
                if (strs[i].charAt(j) != strs[i + 1].charAt(j)) {
                    prefix = prefix.substring(0, j);
                }
            }
        }
        return prefix;
    }
}
