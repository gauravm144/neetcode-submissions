class Solution {
    public String convertToTitle(int columnNumber) {
        char ch[] = new char[27];
        char tmp = 'A';
        ch[0] = 'Z'; // Correctly handles remainder 0 as 'Z'
        for (int i = 1; i <= 26; i++) {
            ch[i] = tmp;
            tmp++;
        }
        
        String ans = "";
        while (columnNumber != 0) {
            int remainder = columnNumber % 26;
            ans = ch[remainder] + ans;
            
            // THE FIX: If remainder is 0, we've used a 'Z' (26), 
            // so we must shift the division down by 1.
            if (remainder == 0) {
                columnNumber = (columnNumber / 26) - 1;
            } else {
                columnNumber = columnNumber / 26;
            }
        }
        return ans;
    }
}
