class Solution {
    public int minCostClimbingStairs(int[] cost) {  
        Map<Integer,Integer> mp=new HashMap<>(); 
    return Math.min( findit(cost,0,mp) , findit(cost,1,mp) );
    }
    int findit(int[] cost,int idx,Map<Integer,Integer> mp){
    if(idx>=cost.length)
        return 0;
    if(mp.containsKey(idx))
    return mp.get(idx);

    int s1=findit(cost,idx+1,mp);
    int s2=findit(cost,idx+2,mp);
    mp.put(idx,cost[idx]+Math.min(s1,s2));
    return mp.get(idx);
    }
}
