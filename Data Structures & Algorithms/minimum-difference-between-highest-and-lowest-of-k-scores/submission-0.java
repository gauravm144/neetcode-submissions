class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     System.out.print(nums[i]+" ");
        // }
        int start=0,end=k-1,ans=Integer.MAX_VALUE;
        for(int i=end;i<nums.length;i++){
            ans=Math.min(nums[end]-nums[start],ans);
            start++;
            end++;
        }
        return ans;
    }
}