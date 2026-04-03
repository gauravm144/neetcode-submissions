class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left=0,right=matrix[0].length-1;
        int up=0,down=matrix.length-1;
        List<Integer> ans=new ArrayList<>();
while(left<=right && up<=down){
        for(int start=left;start<=right;start++){
            ans.add(matrix[up][start]);
        }
        up++;
        for(int start=up;start<=down;start++){
            ans.add(matrix[start][right]);
        }
        right--;
        if (up <= down)
        for(int start=right;start>=left;start--){
            ans.add(matrix[down][start]);
        }
        down--;
        if (left <= right)
        for(int start=down;start>=up;start--){
            ans.add(matrix[start][left]);
        }
        left++;
}
        return ans;

    }
}
