class Solution {
    public boolean canJump(int[] nums) {
        boolean[] dp=new boolean[nums.length];
        return find(nums,0,dp);
    }
    boolean find(int[] nums,int idx, boolean[] dp){
        if(idx==nums.length-1)
        return true;
        if(idx>=nums.length)
        return false;
        if(nums[idx]==0)
        return false;
        if(dp[idx]==true)
        return true;

        boolean ispos=false;
        for(int i=1;i<=nums[idx];i++){
            ispos=ispos|find(nums,idx+i,dp);
        }
        dp[idx]=ispos;
        return dp[idx];
    }
}
