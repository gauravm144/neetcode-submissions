class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Boolean> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],false);
        }
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i]+1))
            mp.put(nums[i],true);
        }
        int ans=0;
        for(Map.Entry<Integer,Boolean> map:mp.entrySet()){
            int value=map.getKey();
            boolean bool=map.getValue();
            if(bool==false){
                int tmp=1;
                while(--value>=Integer.MIN_VALUE&&mp.containsKey(value)){
                    tmp++;
                }
                ans=Math.max(ans,tmp);
            }
        }
        return ans;
    }
}
