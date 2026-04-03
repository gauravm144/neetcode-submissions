class Pair{
    int i;
    int j;
    public Pair(int i,int j){
        this.i=i;
        this.j=j;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int fresh = 0;
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2)
                {
                    q.add(new Pair(i,j));
                }
                else if(grid[i][j]==1)
                fresh++;
            }
        }
        if(fresh==0)
        return 0;
        
        int ans=0;
        
        while(!q.isEmpty()){

        int size=q.size();
        while(size>0){
            size--;
            Pair p=q.poll();
            int row=p.i;
            int col=p.j;
            // up
            if(row-1>=0&&grid[row-1][col]==1){
                q.add(new Pair(row-1,col));
                grid[row-1][col]=2;
                fresh--;
            }
            // left
            if(col-1>=0&&grid[row][col-1]==1){
                q.add(new Pair(row,col-1));
                grid[row][col-1]=2;
                fresh--;
            }
            // down
            if(row+1<n&&grid[row+1][col]==1){
                q.add(new Pair(row+1,col));
                grid[row+1][col]=2;
                fresh--;
            }
            // right
            if(col+1<m&&grid[row][col+1]==1){
                q.add(new Pair(row,col+1));
                grid[row][col+1]=2;
                fresh--;
            }
        }
        ans++;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1)
                return -1;
            }
        }
        return fresh==0?ans-1:-1;
    }
}
