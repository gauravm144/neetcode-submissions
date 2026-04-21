class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
        if(m>n)
        return -1;
        int i=0,j=m-1,k=0;
        int ans=-1;
        while(j<n){
            if(needle.charAt(k)==haystack.charAt(i)){
                for(int start=i;start<=j;start++){
                    if(needle.charAt(k)==haystack.charAt(start))
                    k++;
                }
                if(k==m)
                return i;
                else
                k=0;
            }
            i++;
            j++;
        }
        return -1;
    }
}