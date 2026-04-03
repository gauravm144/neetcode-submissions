class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        findsubsets(res,nums,0,new ArrayList<>());
        return res;
    }
    void findsubsets(List<List<Integer>> res,int[] nums,int idx,List<Integer> cur){
        if(idx==nums.length)
        {
            res.add(new ArrayList<>(cur));
            return;
        }
            cur.add(nums[idx]);
            findsubsets(res,nums,idx+1,cur);
            cur.remove(cur.size()-1);
            findsubsets(res,nums,idx+1,cur);
    }
}
