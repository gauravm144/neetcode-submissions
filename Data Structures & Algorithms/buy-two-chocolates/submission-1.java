class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int tmp=money;
        money-=prices[0];
        money-=prices[1];
        return money<0?tmp:money;
    }
}