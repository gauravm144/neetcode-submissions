class Solution {
    public int subsetXORSum(int[] nums) {
        int[] ans=new int[1];
        findAll(nums,0,0,ans);
        return ans[0];
    }
    void findAll(int[] nums,int idx,int count,int[] ans){
        if(idx==nums.length){
            System.out.println(count);
            ans[0]+=count;
            return;
        }
        // pick
        findAll(nums,idx+1,count^nums[idx],ans);
        // dont
        findAll(nums,idx+1,count,ans);
    }
}