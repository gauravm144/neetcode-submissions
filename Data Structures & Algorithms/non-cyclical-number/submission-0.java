class Solution {
    public boolean isHappy(int n) {
        Map<Integer,Integer> mp=new HashMap<>();
        while(n!=1){
            if(mp.containsKey(n)){
                return false;
            }
            else{
                mp.put(n,findsum(n));
            }
            n=findsum(n);
        }
        return true;
    }
    int findsum(int tmp){
        int sum=0;
        while(tmp!=0){
        sum+=(tmp%10)*(tmp%10);
        tmp=tmp/10;
        }
        return sum;
    }
}
