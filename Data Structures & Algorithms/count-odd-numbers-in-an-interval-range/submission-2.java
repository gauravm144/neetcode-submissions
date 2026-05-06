class Solution {
    public int countOdds(int low, int high) {
        if(low%2==0&&high%2==0){
            return 0+(high-low-2)/2+1+0;
        }
        else if(low%2==0&&high%2==1){
            return 1+(high-low-2)/2+1+0;
        }
        else if(low%2==1&&high%2==0){
            return 0+(high-low-2)/2+1+1;
        }
        else if(low%2==1&&high%2==1){
            return 1+(high-low-2)/2+1;
        }
        return 0;
    }
}