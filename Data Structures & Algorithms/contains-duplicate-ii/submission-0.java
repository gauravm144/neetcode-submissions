class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        int i=0;
        while(i<k){
            if(mp.containsKey(nums[i]))
            return true;
            else
            mp.put(nums[i],i);
            i++;
        }
        while(i<nums.length){
            if(mp.containsKey(nums[i])&&Math.abs(mp.get(nums[i])-i)<=k)
            return true;
            else{
                mp.put(nums[i],i);
            }
            i++;
        }
        return false;
    }
}