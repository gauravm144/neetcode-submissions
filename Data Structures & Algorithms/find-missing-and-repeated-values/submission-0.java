class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        boolean[][] matrix=new boolean[n][n];
        int ans[]=new int[2];
        int repeat=-1;
        int missing=0;
        printmat(matrix);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int num=grid[i][j];
                int row=(num-1)/n;
                int col=(num-1)%n;
                if(matrix[row][col]==true)
                    repeat=num;
                else
                matrix[row][col]=true;

                missing+=grid[i][j];
            }
        }
        printmat(matrix);
        System.out.print(missing);
        ans[0]=repeat;
        missing-=repeat;
        System.out.print(missing);
        n=n*n;
        ans[1]=((n*(n+1))/2)-missing;
        return ans;
    }
    void printmat(boolean[][] grid){
        int n=grid.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(grid[i][j]+"\t");
            }
            System.out.println();
        }
    }
}