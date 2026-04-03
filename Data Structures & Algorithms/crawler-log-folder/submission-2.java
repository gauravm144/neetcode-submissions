class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stk=new Stack<>();
        for(String s:logs){
            if(s.length()==2&&s.equals("./")){
            }
            else{
                if(s.charAt(0)=='.'){
                    if(!stk.isEmpty())
                    stk.pop();
                }
                else{
                    stk.push(s.substring(0,s.length()-1));
                }
            }
        }
        return stk.size();
    }
}