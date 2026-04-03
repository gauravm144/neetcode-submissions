class Solution {
    public void sortColors(int[] nums) {
        int i=0,j=0,k=nums.length-1;
        while(j<=k){
            if(nums[j]==1)
            j++;
            else if(nums[j]==0){
                int tmp=nums[i];
                nums[i]=nums[j];
                nums[j]=tmp;
                i++;
                j++;
            }
            else{
                int tmp=nums[k];
                nums[k]=nums[j];
                nums[j]=tmp;
                k--;
            }
        }
    }
}