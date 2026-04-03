class KthLargest {
    PriorityQueue<Integer> q=new PriorityQueue<>();
    int kth=-1;
    public KthLargest(int k, int[] nums) {
        int i=0;        
        kth=k;
        while(i<nums.length){
        q.add(nums[i]);
        i++;
        }
        while(nums.length>0&&q.size()>k){
            q.poll();
        }
    }
    
    public int add(int val) {
        q.add(val);
        while(q.size()>kth){
            q.poll();
        }
        return q.peek();
    }
}
