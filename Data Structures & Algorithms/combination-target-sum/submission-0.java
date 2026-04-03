class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        int sum=0;
        findall(res,cur,sum,nums,target,0);
        return res;
    }
    void findall(List<List<Integer>> res,List<Integer>cur,int sum,int[] nums, int target,int start){
        if(sum==target){
            res.add(new ArrayList<>(cur));
            return;
        }
        else if(sum>target){
            return;
        }
        for(int i=start;i<nums.length;i++){
            cur.add(nums[i]);
            sum+=nums[i];
            findall(res,cur,sum,nums,target,i);
            cur.remove(cur.size()-1);
            sum-=nums[i];
        }
    }
}
