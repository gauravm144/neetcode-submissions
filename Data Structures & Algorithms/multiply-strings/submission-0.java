class Solution {
    public String multiply(String num1, String num2) {
        int n1=num1.length();
        int n2=num2.length();
        int[] ar=new int[n1+n2];
        int carry=0;
        int k=0,l=0;
        for(int i=num1.length()-1;i>=0;i--){
            int outsidenum=num1.charAt(i)-'0';
            k=l;
            for(int j=num2.length()-1;j>=0;j--){
                int insidenum=num2.charAt(j)-'0';
                int mul=outsidenum*insidenum+carry;
                carry=mul/10;
                mul=mul%10;
                ar[k]+=mul;
                k++;
            }
            if(carry!=0){
            ar[k]+=carry;
            carry=0;}
            l++;
        }
            int prev=0;
            for (int end =0; end <= ar.length - 1; end++) {
                ar[end]+=prev;
                prev=ar[end]/10;
                ar[end]=ar[end]%10;
            }
        int pos=-1;
        for (int end =ar.length - 1; end >=0; end--) {
                if(ar[end]!=0){
                    pos=end;
                    break;
                }
            }
        if(pos==-1)
        return "0";
        StringBuilder sb = new StringBuilder();
        for (int i = pos; i >= 0; i--) {
            sb.append(ar[i]);
        }
        String result = sb.toString();
        return result;
    }
}
