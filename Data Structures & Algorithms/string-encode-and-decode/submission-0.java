class Solution {

    public String encode(List<String> strs) {
        StringBuffer encodedstring=new StringBuffer();
        for(String s:strs){
        encodedstring.append(s.length());
        encodedstring.append("#");    
        encodedstring.append(s);
        }
       return encodedstring.toString();
    }

    public List<String> decode(String str) {
        List<String> ans=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            //  Find the delimiter '#'
            int hashindex=str.indexOf('#',i);
            //  Parse the length from the characters before the '#'
            int length=Integer.parseInt(str.substring(i,hashindex));
            //  Extract the string starting after '#' using the length
            int start=hashindex+1;
            int end=start+length;
            ans.add(str.substring(start,end));
            //  Move the pointer to the start of the next segment
            i=end;
        }
        return ans;

    }
}
