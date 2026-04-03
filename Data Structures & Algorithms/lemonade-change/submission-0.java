class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n5=0;
        int n10=0;
        int n20=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                n5++;
            }
            else if(bills[i]==10){
                if(n5==0)
                return false;
                else
                {
                    n10++;
                    n5--;
                }
            }
            else{ 
                if(n10>=1&&n5>=1){
                    n10--;
                    n5--;
                }
                else if(n10==0&&n5>=3){
                    n5=n5-3;
                }
                else
                return false;
            }
        }
        return true;
    }
}