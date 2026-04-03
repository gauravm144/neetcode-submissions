class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
            find(1,k,n,new ArrayList<>(),ans);
        return ans;
    }
    void find(int i,int k,int n,List<Integer> cur,List<List<Integer>> ans){
        if(k==cur.size()){
            ans.add(new ArrayList<>(cur));
            return;
        }
        if(i>n)
        return;
        // choose
        cur.add(i);
        find(i+1,k,n,cur,ans);
        cur.remove(cur.size()-1);
        find(i+1,k,n,cur,ans);
    }
}