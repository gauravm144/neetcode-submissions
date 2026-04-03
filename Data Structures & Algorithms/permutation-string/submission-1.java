class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] cs1=new int[26];

        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            cs1[ch-'a']++;
        }
        int[] window=new int[26];
        fill(0,s1.length()-2,window,s2);

        int start=0,end=s1.length()-1;
        while(end<s2.length()){
        window[s2.charAt(end)-'a']++;
        boolean get=check(cs1,window);
        if(get==true)
        return true;
        window[s2.charAt(start)-'a']--;
        start++;
        end++;
        }

        return false;
    }
    public boolean check(int[] cs1,int[] window){
        for(int i=0;i<26;i++){
            if(cs1[i]!=window[i])
            return false;
        }
        return true;
    }
    public void fill(int start,int end,int[] window,String s2){
        for(int i=start;i<=end;i++){
            char ch=s2.charAt(i);
            window[ch-'a']++;
        }
    }
}
