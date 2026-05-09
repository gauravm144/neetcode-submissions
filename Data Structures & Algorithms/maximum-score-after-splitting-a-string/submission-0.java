class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int left[] = new int[n];
        int right[] = new int[n];

        // 1. Fill left array: Zeros from 0 to i
        int leftsum = 0;
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == '0') leftsum++;
            left[i] = leftsum;
        }

        // 2. Fill right array: Ones from i to n-1
        int rightsum = 0;
        for(int i = n - 1; i >= 0; i--) {
            if(s.charAt(i) == '1') rightsum++;
            right[i] = rightsum;
        }

        int ans = 0;
        // 3. Split point 'i' means Left is [0...i] and Right is [i+1...n-1]
        // Loop runs to n-2 to ensure the right side has at least one character
        for(int i = 0; i < n - 1; i++) {
            ans = Math.max(ans, left[i] + right[i+1]);
        }

        return ans;
    }
}
