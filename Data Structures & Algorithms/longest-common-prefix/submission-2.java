class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String first=strs[0];
        String ans="";
        int i=0;
        boolean end=false;
        while(!end&&i<first.length()){
            boolean go=true;
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length()||first.charAt(i)!=strs[j].charAt(i)){
                go=false;
                break;}
            }
            if(go==false)
            break;
            i++;
        }
        ans=first.substring(0,i);
        return ans;
    }
}