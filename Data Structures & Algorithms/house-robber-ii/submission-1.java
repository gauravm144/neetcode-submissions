class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
        return nums[0];
        
        int dp[]=new int[nums.length];
        int from,to;
        // 0 to n-2
        from=0;to=nums.length-2;
        int part1=findcost(nums,from,to,dp);
        // 1 to n-1
        dp=new int[nums.length];
        from=1;to=nums.length-1;
        int part2=findcost(nums,from,to,dp);
        return Math.max(part1,part2);
    }
    int findcost(int[] nums,int idx,int end,int dp[]){
        if(idx>end)
        return 0;
        
        if(dp[idx]!=0)
        return dp[idx];

        int pick=nums[idx]+findcost(nums,idx+2,end,dp);
        int skip=findcost(nums,idx+1,end,dp);

        dp[idx]=Math.max(pick,skip);
        return dp[idx];
    }
}
