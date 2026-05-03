class Solution {
    public boolean isPerfectSquare(int num) {
        double a=Math.sqrt(num);
        System.out.print(a);
        return (int)a==a?true:false;
    }
}