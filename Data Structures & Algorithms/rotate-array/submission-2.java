class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        rev(nums,0,nums.length-k-1);
        rev(nums,nums.length-k,nums.length-1);
        rev(nums,0,nums.length-1);
    }
    void rev(int nums[],int i,int j){
        while(i<j){
            int tmp=nums[i];
            nums[i]=nums[j];
            nums[j]=tmp;
            i++;
            j--;
        }
    }
}