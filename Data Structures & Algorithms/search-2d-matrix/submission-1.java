class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0,high=matrix[0].length-1;
        int i=0;
        while(i<matrix.length&&low<=high){
            if(target>matrix[i][low]&&target>matrix[i][high]){
            i++;
            continue;}
            int mid=low+(high-low)/2;
            if(matrix[i][mid]==target)
            return true;
            else if(matrix[i][mid]<target)
            low=mid+1;
            else
            high=mid-1;
        }
        return false;
    }
}
