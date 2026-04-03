class Pair{
    int val;
    int idx;
    public Pair(int val,int idx){
        this.val=val;
        this.idx=idx;
    }
}
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Pair> q = new PriorityQueue<>((a, b) -> {
    if (a.val != b.val) {
        return Integer.compare(a.val, b.val); // Sort by val
    }
    return Integer.compare(a.idx, b.idx);     // If val is same, sort by idx
});

        for(int i=0;i<nums.length;i++){
            q.offer(new Pair(nums[i],i));
        }
        while(k!=0){
            Pair tmp=q.poll();
            tmp.val=tmp.val*multiplier;
            q.offer(tmp);
            k--;
        }
        while(!q.isEmpty()){
            Pair tmp=q.poll();
            nums[tmp.idx]=tmp.val;
        }
        return nums;
    }
}