class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return findall(nums,target,0,0);
    }
    int findall(int[] nums, int target,int idx,int sum){
        if(idx==nums.length){
            if(target==sum)
                return 1;
            return 0;
        }
        return findall(nums,target,idx+1,sum+nums[idx])
        + findall(nums,target,idx+1,sum-nums[idx]);
    }
}
