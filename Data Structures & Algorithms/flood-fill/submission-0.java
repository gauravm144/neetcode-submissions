class Pair{
    int i,j;
    public Pair(int i,int j){
        this.i=i;
        this.j=j;
    }
}
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color)
        return image;
        Queue<Pair> q=new LinkedList<>();
        int oldcolor=image[sr][sc];
        q.offer(new Pair(sr,sc));
        image[sr][sc]=color;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=1;i<=size;i++){
                Pair p=q.poll();
                // left
                if(p.j-1>=0&&image[p.i][p.j-1]==oldcolor){
                q.offer(new Pair(p.i,p.j-1));
                image[p.i][p.j-1]=color;
                }
                // up
                if(p.i-1>=0&&image[p.i-1][p.j]==oldcolor){
                q.offer(new Pair(p.i-1,p.j));
                image[p.i-1][p.j]=color;
                }
                // right
                if(p.j+1<image[0].length&&image[p.i][p.j+1]==oldcolor){
                q.offer(new Pair(p.i,p.j+1));
                image[p.i][p.j+1]=color;
                }
                // down
                if(p.i+1<image.length&&image[p.i+1][p.j]==oldcolor){
                q.offer(new Pair(p.i+1,p.j));
                image[p.i+1][p.j]=color;
                }
            }
        }
        return image;
    }
}