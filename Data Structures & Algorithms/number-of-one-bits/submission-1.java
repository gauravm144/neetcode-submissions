class Solution {
    public int hammingWeight(int n) {
        int i=1;
        int ans=0;
        while(n!=0){
            if((i&n)!=0)
            ans++;
            n=n/2;
        }
        return ans;
    }
}
