class Solution {
    public String addBinary(String a, String b) {
        StringBuilder str=new StringBuilder();
        if(a.length()<b.length()){
            String tmp=a;
            a=b;
            b=tmp;
        }
        int i=a.length()-1,j=b.length()-1;
        int carry=0;
        while(j>=0){
            int a1=a.charAt(i)-'0';
            int a2=b.charAt(j)-'0';
            str.append((a1+a2+carry)%2);
            carry=(a1+a2+carry)/2;
            j--;
            i--;
        }
        while(i>=0){
            int a1=a.charAt(i)-'0';
            str.append((a1+carry)%2);
            carry=(a1+carry)/2;
            i--;
        }
        if(carry!=0)
        str.append(carry);
        return str.reverse().toString();
    }
}