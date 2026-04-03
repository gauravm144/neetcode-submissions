class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        findall(res,new ArrayList<>(),0,target,candidates,0);
        return res;
    }
    void findall(List<List<Integer>> res, List<Integer>cur, int sum,int target,int[] candidates,int start){
        if(sum==target){
            res.add(new ArrayList<>(cur));
            return;
        }
        else if(sum>target){
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(i>start&&candidates[i]==candidates[i-1])
                continue;
            cur.add(candidates[i]);
            sum+=candidates[i];
            findall(res,cur,sum,target,candidates,i+1);
            sum-=candidates[i];
            cur.remove(cur.size()-1);
        }
    }
}
