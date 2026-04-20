class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        boolean[] seen = new boolean[size + 1];
        int[] ans = new int[2];
        
        long actualSum = 0;
        int repeat = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = grid[i][j];
                if (seen[num]) {
                    repeat = num;
                } else {
                    seen[num] = true;
                }
                actualSum += num;
            }
        }

        // Total sum of 1 to n^2 is (N * (N + 1)) / 2
        long expectedSum = (long) size * (size + 1) / 2;
        
        // Sum of grid - repeat = sum of all unique numbers
        // Missing = expectedSum - (actualSum - repeat)
        int missing = (int) (expectedSum - (actualSum - repeat));

        ans[0] = repeat;
        ans[1] = missing;
        return ans;
    }
}
