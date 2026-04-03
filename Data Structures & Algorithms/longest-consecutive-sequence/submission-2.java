class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int ans=0;
        for(Integer s:set){
            int cur=s;
            //means it is startig
            int tmp=1;
            if(set.contains(cur-1)==false){
                while(set.contains(++cur)==true){
                    tmp++;
                }
                ans=Math.max(ans,tmp);
            }
        }
        return ans;
    }
}
