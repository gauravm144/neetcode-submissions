class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans=new int[2];
        // Map<Integer,Integer> mp=new HashMap<>();
        // for(int i=0;i<numbers.length;i++){
        //     int find=target-numbers[i];
        //     if(mp.containsKey(find)){
        //         ans[0]=mp.get(find)+1;
        //         ans[1]=i+1;
        //         break;
        //     }
        //     else{
        //         mp.put(numbers[i],i);
        //     }
        // }

        int i=0,j=numbers.length-1;
        while(i<j){
            int sum=numbers[i]+numbers[j];
            if(sum==target)
            {
                ans[0]=i+1;
                ans[1]=j+1;
                return ans;
            }
            else if(sum<target)
            i++;
            else
            j--;
        }

        return ans;
    }
}
