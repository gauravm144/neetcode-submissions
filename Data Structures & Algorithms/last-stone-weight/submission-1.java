class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            maxHeap.add(stones[i]);
        }
        while(maxHeap.size()>1){
            int a=maxHeap.poll();
            int b=maxHeap.poll();
            int diff=a-b;
            if(diff>0)
            maxHeap.add(diff);
        }
        return maxHeap.isEmpty()?0:maxHeap.peek();

    }
}
