class Solution {
    int ans=0;
    public int uniquePaths(int m, int n) {
        boolean[][] board=new boolean[m][n];
        int[][] dp=new int[m][n];
        board[0][0]=true;
        countall(board,m,n,0,0,dp);
        return dp[0][0];
    }
    int countall(boolean[][] board,int m, int n,int row,int col,int[][] dp){
        if(row>=m)
        return 0;
        if(col>=n)
        return 0;

        if(row==m-1&&col==n-1){
            dp[row][col]=1;
            return 1;
        }
        if(dp[row][col]!=0)
        return dp[row][col];

        board[row][col]=true;
        int right=countall(board,m,n,row,col+1,dp);
        int down=countall(board,m,n,row+1,col,dp);
        dp[row][col]=right+down;
        board[row][col]=false;
        return dp[row][col];
    }
}
