class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        
        StringBuilder[] sb = new StringBuilder[numRows];
        int row = 0;
        int a = 1;
        String answer = "";
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }
        
        for (int i = 0; i < s.length(); i++) {
            sb[row].append(String.valueOf(s.charAt(i)));
            row += a;
            if (row == numRows - 1 || row == 0) {
                a *= -1;
            }
        }
        
        StringBuilder sb2 = new StringBuilder();
        for (StringBuilder r : sb) {
             sb2.append(r);
        }
        return sb2.toString();

    }
}
