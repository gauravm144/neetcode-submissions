class Solution {
    public int firstUniqChar(String s) {
        int[] arr=new int[26];
        for(int i=0;i<26;i++)
        arr[i]=-1;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int tmp=arr[ch-'a'];
            if(tmp==-1)
            arr[ch-'a']=i;
            else if(arr[ch-'a']==-2)
            continue;
            else{
                arr[ch-'a']=-2;
            }
        }
        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
                if (arr[i] >= 0) {
                minIndex = Math.min(minIndex, arr[i]);
                } 
        }
    return minIndex == Integer.MAX_VALUE ? -1 : minIndex;
    }
}