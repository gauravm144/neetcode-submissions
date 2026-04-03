class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        boolean[][] board=new boolean[n][n];
        // printboard(board,n);
        findplaces(res,board,n,0);
        return res;
    }
    void findplaces(List<List<String>> res,boolean[][] board,int n,int row){
        if(row==n){
            List<String> lst=new ArrayList<>();
            for(int i=0;i<n;i++){
                StringBuffer s=new StringBuffer();
                for(int j=0;j<n;j++){
                    if(board[i][j]==true)
                    s.append("Q");
                    else
                    s.append(".");
                }
                lst.add(s.toString());
            }
            res.add(lst);
            return;
        }

        for(int j=0;j<n;j++){
            if(board[row][j]==false&&condition(board,row,j)==true){
                    board[row][j]=true;
                    findplaces(res,board,n,row+1);
                    board[row][j]=false;
                }
            }

    }
    boolean condition(boolean[][] board,int currow,int curcol){
            int n=board.length;
            // up row
            for(int i=currow;i>=0;i--){
                if(board[i][curcol]==true)
                return false;
            }
            // left up diagonal
            for(int i=currow,j=curcol;i>=0&&j>=0;i--,j--){
                if(board[i][j]==true)
                return false;
            }
            // right up diagonal
            for(int i=currow,j=curcol;i>=0&&j<n;i--,j++){
                if(board[i][j]==true)
                return false;
            }
            return true;
    }
    void printboard( boolean[][] board,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==true){
                    System.out.print("Q\t");
                }
                else{
                    System.out.print("_\t");
                }
            }
            System.out.println();
        }
    }
}
