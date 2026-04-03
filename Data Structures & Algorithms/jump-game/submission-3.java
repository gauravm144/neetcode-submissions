class Solution {
    public boolean canJump(int[] nums) {
        return find(nums,0);
    }
    boolean find(int[] nums,int idx){
        if(idx==nums.length-1)
        return true;
        if(idx>=nums.length)
        return false;
        if(nums[idx]==0)
        return false;
        boolean ispos=false;
        for(int i=1;i<=nums[idx];i++){
            ispos=ispos|find(nums,idx+i);
        }
        return ispos;
    }
}
