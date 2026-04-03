class Solution {
    public boolean hasDuplicate(int[] nums) {
        // return using_simple_way_n_square(nums,nums.length);
        return using_optimized_way(nums,nums.length);
    }
    public boolean using_simple_way_n_square(int[] nums,int n){
        for(int i=0;i<n;i++){
            int elem=nums[i];
            for(int j=i+1;j<n;j++){
                if(elem==nums[j])
                return true;
            }
        }
        return false;
    }
    public boolean using_optimized_way(int[] nums,int n){
        // hashset and map do in O(1) in avg case and log(n) in worst case
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)==true)
            return true;
            else
            set.add(num);
        }
        return false;
    }

}