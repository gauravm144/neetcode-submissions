class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        for(int a:piles){
            right=Math.max(right,a);
        }
        while(left<right){
            int mid=left+(right-left)/2;
            int hours=0;
            for(int i=0;i<piles.length;i++){
                hours+=Math.ceil((double)piles[i]/mid);
            }
            if(hours>h)
            left=mid+1;
            else
            right=mid;
        }
        return left;
    }
}
