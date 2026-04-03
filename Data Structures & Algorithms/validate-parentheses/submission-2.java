class Solution {
    public boolean isValid(String s) {
        // Stack<Character> stk=new Stack<>();

        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(ch=='['||ch=='{'||ch=='('){
        //         stk.push(ch);
        //     }
        //     else{
        //         if(stk.size()==0)
        //         return false;
        //         char tp=stk.pop();
        //         if(ch==']'&&tp!='[')
        //         return false;
        //         else if(ch=='}'&&tp!='{')
        //         return false;
        //         else if(ch==')'&&tp!='(')
        //         return false;
        //     }
        // }
        // return stk.size()==0?true:false;

         Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(') stack.push(')');
            else if (ch == '{') stack.push('}');
            else if (ch == '[') stack.push(']');
            else {
                if (stack.isEmpty() || stack.pop() != ch)
                    return false;
            }
        }

        return stack.isEmpty();
        
    }
}
