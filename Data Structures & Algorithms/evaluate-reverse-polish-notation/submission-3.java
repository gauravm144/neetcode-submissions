class Solution {
    public int evalRPN(String[] tokens) {
        int i=0;
        Stack<Integer> stk=new Stack<>();

        while(i<tokens.length){
            char ch=tokens[i].charAt(0);
            if((ch=='-'&&tokens[i].length()>1)||ch>='0'&&ch<='9'){
                stk.push(Integer.parseInt(tokens[i]));
            }
            else{
                int v1=stk.pop();
                int v2=stk.pop();
                // v2 pehle hoga
                if(ch=='+'){
                    v2=v2+v1;
                }
                else if(ch=='-'){
                    v2=v2-v1;
                }
                else if(ch=='*'){
                    v2=v2*v1;
                }
                else{
                    v2=v2/v1;
                }
                stk.push(v2);
            }
            i++;
        }
        return stk.pop();
    }
}
