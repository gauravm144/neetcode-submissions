class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1,j=0;
        while(i>=0){
            if(s.charAt(i)==' ')
            i--;
            else{
                j=i;
                while(i>=0&&s.charAt(i)!=' '){
                    i--;
                }
                return j-i; 
            }
        }
        return s.length();
    }
}