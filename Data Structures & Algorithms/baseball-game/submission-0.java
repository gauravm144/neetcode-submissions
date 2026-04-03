class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stk=new Stack<>();
        int ans=0;
        for(int i=0;i<operations.length;i++){
            char ch=operations[i].charAt(0);
            if(ch=='+'){
                int b=stk.pop();
                int a=stk.pop();
                stk.push(a);
                stk.push(b);
                stk.push(a+b);
            }
            else if(ch=='D'){
                int a=stk.pop();
                stk.push(a);
                stk.push(a*2);
            }
            else if(ch=='C'){
                stk.pop();
            }
            else
            stk.push(Integer.parseInt(operations[i]));
        }
        while(!stk.isEmpty()){
            System.out.println(stk.peek());
            ans+=stk.pop();
        }
        return ans;
    }
}