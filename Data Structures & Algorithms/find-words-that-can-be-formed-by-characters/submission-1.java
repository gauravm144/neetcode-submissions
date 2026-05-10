class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] arr=new int[26];
        int ans=0;
        for(int i=0;i<chars.length();i++){
            char ch=chars.charAt(i);
            arr[ch-'a']++;
        }
        for(String word:words){
            int[] tmparr=new int[26];
            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                if(ch>='a'&&ch<='z')
                tmparr[ch-'a']++;
            }
            if(issafe(arr,tmparr))
            ans+=word.length();
        }
        return ans;
    }
    boolean issafe(int a1[],int a2[]){
        for(int i=0;i<26;i++){
            if(a2[i]!=0&&a1[i]<a2[i])
            return false;
        }
        return true;
    }
}