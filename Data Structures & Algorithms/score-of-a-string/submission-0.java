class Solution {
    public int scoreOfString(String s) {
        int prev=s.charAt(0);
        int ans=0;
        for(int i=1;i<s.length();i++){
            ans+=Math.abs(prev-s.charAt(i));
            prev=s.charAt(i);
        }
        return ans;
    }
}