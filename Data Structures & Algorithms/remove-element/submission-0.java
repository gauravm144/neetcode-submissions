class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,j=0;
        while(j<nums.length){
            if(val==nums[j])
            {
                j++;
            }
            else{
                nums[i]=nums[j];
                i++;
                j++;
            }
        }
        return i;
    }
}