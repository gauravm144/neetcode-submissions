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
        Queue<Pair> q=new LinkedList<>();
        boolean isone=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1)
                isone=true;
                if(grid[i][j]==2)
                {
                    q.add(new Pair(i,j));
                    grid[i][j]=2;
                }
            }
        }
        if(q.isEmpty()&&isone==false)
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
            }
            // left
            if(col-1>=0&&grid[row][col-1]==1){
                q.add(new Pair(row,col-1));
                grid[row][col-1]=2;
            }
            // down
            if(row+1<n&&grid[row+1][col]==1){
                q.add(new Pair(row+1,col));
                grid[row+1][col]=2;
            }
            // right
            if(col+1<m&&grid[row][col+1]==1){
                q.add(new Pair(row,col+1));
                grid[row][col+1]=2;
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
        System.out.println("hi");
        return ans-1;
    }
}
