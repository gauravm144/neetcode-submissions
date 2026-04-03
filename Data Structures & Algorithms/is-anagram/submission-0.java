class Solution {
    public boolean isAnagram(String s, String t) {
        // return check_by_sort_nlon_plus_nlogm(s,t);
        return check_by_counting_O_n(s,t);
    }
    public boolean check_by_sort_nlon_plus_nlogm(String s, String t){
        char[] sarray=s.toCharArray();
        Arrays.sort(sarray);
        char[] tarray=t.toCharArray();
        Arrays.sort(tarray);
        if(new String(sarray).equals(new String(tarray)))
        return true;
        return false;
    }
    public boolean check_by_counting_O_n(String s, String t){
        int n=s.length();
        if(n!=t.length())
        return false;

        int[] arr=new int[26];
        for(int i=0;i<n;i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int val:arr){
            if(val!=0)
            return false;
        }
        return true;
    }
}
