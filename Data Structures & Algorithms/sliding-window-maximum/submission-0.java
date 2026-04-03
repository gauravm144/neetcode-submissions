class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int max_so_far=Integer.MIN_VALUE;
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        int j=0;
        while(j<k-1){
            q.add(nums[j]);
            j++;
        }
        int ans[]=new int[nums.length-k+1];
        int idx=0;
        while(j<nums.length){
            int elemj=nums[j];
            q.add(elemj);
            ans[idx++]=q.peek();

            int elemi=nums[i];
            q.remove(elemi);
            i++;
            j++;
        }
        return ans;
    }
}
