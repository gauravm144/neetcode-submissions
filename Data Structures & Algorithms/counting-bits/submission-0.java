class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=1;i<=n;i++){
            int tmp=i;
            int count=0;
            while(tmp!=0)
            {
                if((tmp&1)!=0)
                count++;
                tmp=tmp/2;
            }
            ans[i]=count;
        }
        return ans;
    }
}
