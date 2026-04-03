class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int start=intervals[0][0];
        int end=intervals[0][1];
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            int first=intervals[i][0];
            int second=intervals[i][1];
            if(first>end&&second>end)
                {
                    List<Integer> tmp=new ArrayList<>();
                    tmp.add(start);
                    tmp.add(end);
                    ans.add(tmp);
                    start=intervals[i][0];
                    end=intervals[i][1];
                }
            else{
            end=Math.max(end,second);
            }
        }
        List<Integer> tmp1=new ArrayList<>();
        tmp1.add(start);
        tmp1.add(end);
        ans.add(tmp1);
        int[][] real=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            real[i][0]=ans.get(i).get(0);
            real[i][1]=ans.get(i).get(1);
        }
         return real;
    }
}
