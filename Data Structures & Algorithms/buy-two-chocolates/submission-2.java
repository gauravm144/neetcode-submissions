// class Solution {
//     public int buyChoco(int[] prices, int money) {
//         Arrays.sort(prices);
//         int tmp=money;
//         money-=prices[0];
//         money-=prices[1];
//         return money<0?tmp:money;
//     }
// }
class Solution {
    public int buyChoco(int[] prices, int money) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int p : prices) {
            if (p < min1) {
                min2 = min1;
                min1 = p;
            } else if (p < min2) {
                min2 = p;
            }
        }

        int cost = min1 + min2;
        return (money >= cost) ? (money - cost) : money;
    }
}
