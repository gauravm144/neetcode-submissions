class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(mp.containsKey(nums[i]))
            mp.put(nums[i],mp.get(nums[i])+1);
            else
            mp.put(nums[i],1);
        }
        List<List<Integer>> lst=new ArrayList<>(nums.length+1);
        for(int i=0;i<=nums.length;i++)
        lst.add(new ArrayList<>());

        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            lst.get(entry.getValue()).add(entry.getKey());
            System.out.print(entry.getKey());
            System.out.print("->");
            System.out.print(entry.getValue());
            System.out.println();
        }


        int idx=0;
        int[] ans=new int[k];

        for(int i=nums.length;i>=1&&k>0;i--){
            List<Integer> tmp=lst.get(i);
            for(int j=0;j<tmp.size()&&k>0;j++,k--)
            ans[idx++]=tmp.get(j);
        }

        return ans;
    }
}
