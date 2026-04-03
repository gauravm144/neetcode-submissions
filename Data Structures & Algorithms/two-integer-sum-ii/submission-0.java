class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> mp=new HashMap<>();
        int[] ans=new int[2];
        for(int i=0;i<numbers.length;i++){
            int find=target-numbers[i];
            if(mp.containsKey(find)){
                ans[0]=mp.get(find)+1;
                ans[1]=i+1;
                break;
            }
            else{
                mp.put(numbers[i],i);
            }
        }
        return ans;
    }
}
