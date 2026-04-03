class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        int i=1;
        ans.add(List.of(1));
        if(numRows==1)
        return ans;

        i=2;
        ans.add(List.of(1,1));
        if(numRows==2)
        return ans;

        i=3;
        while(i<=numRows){
            List<Integer> tmp=new ArrayList<>();
            tmp.add(1);
            for(int j=1,k=0;j<=i-2;j++,k++){
                tmp.add(ans.get(ans.size()-1).get(k)+ans.get(ans.size()-1).get(k+1));
            }
            tmp.add(1);
            ans.add(tmp);
            // System.out.println(i);
            i++;
        }
        return ans;
    }
}