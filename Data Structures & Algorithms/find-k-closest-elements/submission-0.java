class Point{
    int val;
    int distance;
    public Point(int x,int y){
        this.val=x;
        this.distance=y;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int d) {
        PriorityQueue<Point> q=new PriorityQueue<>((a,b)->{
            if(a.distance!=b.distance)
            return b.distance-a.distance;
            else
            return a.val-b.val;
        });
        int i=0;
        for(;i<arr.length&&k>0;i++,k--){
        q.offer(new Point(arr[i],Math.abs(arr[i]-d)));
        }
        for(;i<arr.length;i++){
               
            if(q.peek().distance>Math.abs(arr[i]-d)){ 
                q.poll();
                q.offer(new Point(arr[i],Math.abs(arr[i]-d)));
                }
            else if(q.peek().distance==Math.abs(arr[i]-d)&&q.peek().val>arr[i]){
                q.poll();
                q.offer(new Point(arr[i],Math.abs(arr[i]-d)));
                }
        }
        List<Integer> ans=new ArrayList<>();
        while(!q.isEmpty()){
            ans.add(q.poll().val);
        }
        Collections.sort(ans);
        return ans;
    }
}