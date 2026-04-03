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
        // Min-heap: sort by value, then by index
        PriorityQueue<Pair> q = new PriorityQueue<>((a, b) -> {
            if (a.val != b.val) return Integer.compare(a.val, b.val);
            return Integer.compare(a.idx, b.idx);
        });

        for (int i = 0; i < nums.length; i++) {
            q.offer(new Pair(nums[i], i));
        }

        while (k > 0) {
            Pair tmp = q.poll();
            
            // 1. Update the value
            tmp.val *= multiplier;
            
            // 2. Sync it back to the original array immediately
            nums[tmp.idx] = tmp.val;
            
            // 3. Put it back in the heap for the next round
            q.offer(tmp);
            k--;
        }

        return nums;
    }
}
