class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        int ans=-1;
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            if(map.containsKey(arr[i])){
                count=map.get(arr[i]);
            }
            map.put(arr[i],count+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==entry.getKey())
                ans=Math.max(ans,entry.getKey());
        }
        return ans;
    }
}