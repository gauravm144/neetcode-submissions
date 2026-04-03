class Pair{
    int i;
    int j;
    public Pair(int i,int j){
        this.i=i;
        this.j=j;
    }
}
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] visited=new boolean[n][m];
        Queue<Pair> q=new LinkedList<>();
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int ch=grid[i][j];
                if(ch==1&&!visited[i][j]){
                    int tmp=0;
                    q.add(new Pair(i,j));
                    tmp++;
                    visited[i][j]=true;
                    while(!q.isEmpty()){
                        Pair p=q.poll();
                        int row=p.i;
                        int col=p.j;
                        // up
                        if(row-1>=0&&grid[row-1][col]==1&&!visited[row-1][col]){
                        q.add(new Pair(row-1,col));
                        visited[row-1][col]=true;
                        tmp++;
                        }
                        // left
                        if(col-1>=0&&grid[row][col-1]==1&&!visited[row][col-1]){
                        q.add(new Pair(row,col-1));
                        visited[row][col-1]=true;
                        tmp++;
                        }
                        // down
                        if(row+1<n&&grid[row+1][col]==1&&!visited[row+1][col]){
                        q.add(new Pair(row+1,col));
                        visited[row+1][col]=true;
                        tmp++;
                        }
                        // right
                        if(col+1<m&&grid[row][col+1]==1&&!visited[row][col+1]){
                        q.add(new Pair(row,col+1));
                        visited[row][col+1]=true;
                        tmp++;
                        }
                    }
                    ans=Math.max(tmp,ans);
                }
            }
        }
        return ans;
    }
}
