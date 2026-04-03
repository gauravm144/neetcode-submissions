class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        boolean[] flag=new boolean[nums.length];
        findall(res,new ArrayList<>(),nums,flag);
        return res;
    }
    void findall(List<List<Integer>> res,List<Integer> cur,int[] nums,boolean[] flag){
        if(cur.size()==nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(flag[i])
            continue;

            cur.add(nums[i]);
            flag[i]=true;
            findall(res,cur,nums,flag);
            cur.remove(cur.size()-1);
            flag[i]=false;
        }

    }
}
