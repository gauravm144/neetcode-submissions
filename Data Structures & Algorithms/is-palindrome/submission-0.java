class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char chi=s.charAt(i);
            char chj=s.charAt(j);
            if(!isalphanumeric(chi)){
                i++;
            }
            else if(!isalphanumeric(chj)){
                j--;
            }
            else{
                if(Character.toLowerCase(chi)!=Character.toLowerCase(chj))
                return false;

                i++;
                j--;
            }
        }
        return true;
    }
    boolean isalphanumeric(char ch){
        return (ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9');
    }
}
