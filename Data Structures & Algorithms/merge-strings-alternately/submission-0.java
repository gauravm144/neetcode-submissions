class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        StringBuilder tmp=new StringBuilder();
        while(i<word1.length()&&j<word2.length()){
            tmp.append(word1.charAt(i++));
            tmp.append(word2.charAt(j++));
        }
        while(i<word1.length()){
            tmp.append(word1.charAt(i++));
        }
        while(j<word2.length()){
            tmp.append(word2.charAt(j++));
        }
        return tmp.toString();
    }
}