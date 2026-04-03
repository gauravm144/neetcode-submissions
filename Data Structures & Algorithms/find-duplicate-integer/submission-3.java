class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int num=nums[Math.abs(nums[i])-1];
            if(num<0)
            return Math.abs(nums[i]);
            else
            nums[Math.abs(nums[i])-1]=-nums[Math.abs(nums[i])-1];
            for(int j=0;j<nums.length;j++){
                System.out.print(nums[j]+" ");
            }
            System.out.println();
        }
        return -1;
    }
}
