class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]>sum){
            sum+=nums[i];
            ans=Math.max(ans,sum);
            }
            else{
                sum=0;
            }
        }
        return ans;
    }
}