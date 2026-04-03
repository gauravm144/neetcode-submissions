class Solution {
    Map<Integer,Integer> mp=new HashMap<>();
    public int climbStairs(int n) {   
        if(n==0)
        return 1;
        else if(n<0)
        return 0;
        if(mp.containsKey(n))
        return mp.get(n);

        int sum=climbStairs(n-1)+climbStairs(n-2);
        mp.put(n,sum);
        return sum;

    }
}
