class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        int i=0;
        while(i<k){
            q.add(nums[i]);
            i++;
        }
        while(i<nums.length){
            q.add(nums[i]);
            q.poll();
            i++;
        }
        return q.peek();
    }
}
