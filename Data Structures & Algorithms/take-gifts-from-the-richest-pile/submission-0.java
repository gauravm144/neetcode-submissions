class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<gifts.length;i++)
        q.offer(gifts[i]);

        while(k!=0){
            int tmp=q.poll();
            tmp=(int)Math.sqrt(tmp);
            q.offer(tmp);
            k--;
        }
        long ans=0;
        while(!q.isEmpty()){
            ans+=q.poll();
        }
    return ans;
    }
}