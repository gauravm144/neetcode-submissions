class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
        return true;
        int i=0,j=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            while(j<t.length()){
                if(ch==t.charAt(j))
                break;
                j++;
            }
            if(j==t.length())
            return false;
            i++;
            j++;
            if(i==s.length())
            return true;
        }
        return false;
    }
}