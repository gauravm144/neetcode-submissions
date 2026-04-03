class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        Stack<Integer> stk=new Stack<>();
        int[] result=new int[n];
        for(int i=n-1;i>=0;i--){
            while(stk.isEmpty()==false&&temperatures[i]>=temperatures[stk.peek()]){
                stk.pop();
            }
            result[i]=stk.isEmpty()?0:stk.peek()-i;
            stk.push(i);
        }
        return result;
    }
}
