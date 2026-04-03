class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        return findcost(nums, 0,dp);
    }

    int findcost(int[] nums, int idx,int[] dp) {
        // Base Case: No more houses to rob
        if (idx >= nums.length) {
            return 0;
        }
        if(dp[idx]!=0)
            return dp[idx];
        // Case 1: Include this house. Must skip the next one (move to idx + 2)
        int costinclude = nums[idx] + findcost(nums, idx + 2,dp);

        // Case 2: Exclude this house. Can check the next house (move to idx + 1)
        int costexclude = findcost(nums, idx + 1,dp);

        // Return the best of the two paths
        dp[idx]=Math.max(costinclude, costexclude);
        return dp[idx];
    }
}
