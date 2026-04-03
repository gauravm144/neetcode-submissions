class Solution {
    public boolean validPalindrome(String s) {
        boolean isString=check(s);
        if(isString)
        {
            return true;
        }
        else{
            for(int i=0;i<s.length();i++){
                if(isString)
                return true;
                isString=isString|check(s.substring(0,i)+s.substring(i+1,s.length()));
            }
        }
        return false;
    }
    boolean check(String s){
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j))
            return false;
        }
        return true;
    }
}