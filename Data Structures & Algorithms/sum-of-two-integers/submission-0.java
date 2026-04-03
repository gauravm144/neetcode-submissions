class Solution {
    public int getSum(int a, int b) {
        int xor=a^b;
        int and=a&b;
        int carry=(and)<<1;
        while(carry!=0){
            int tmp=xor^carry;
            carry=(xor&carry)<<1;
            xor=tmp;
        }
        return xor;
    }
}
