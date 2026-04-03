class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int ans=0;
        for(int i=0,j=0;j<s.length();){
            char chi=s.charAt(i);
            char chj=s.charAt(j);
            if(set.contains(chj)){
                while(set.size()>0&&set.contains(chj)){
                set.remove(s.charAt(i));
                i++;
                }
            }
            else{
                set.add(chj);
                ans=Math.max(ans,j-i+1);
                j++;
            }
        }
        return ans;
    }
}
