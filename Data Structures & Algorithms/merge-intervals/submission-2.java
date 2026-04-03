class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int start=intervals[0][0];
        int end=intervals[0][1];
        List<int[]> ans=new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            int first=intervals[i][0];
            int second=intervals[i][1];
            if(first>end)
                {
                    int[] tmp=new int[2];
                    tmp[0]=start;
                    tmp[1]=end;
                    ans.add(tmp);
                    start=intervals[i][0];
                    end=intervals[i][1];
                }
            else{
            end=Math.max(end,second);
            }
        }
        int[] tmp=new int[2];
        tmp[0]=start;
        tmp[1]=end;
        ans.add(tmp);
        return ans.toArray(new int[ans.size()][]);
    }
}
