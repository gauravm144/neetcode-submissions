class Solution {
    public int maxDifference(String s) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++)
        arr[s.charAt(i)-'a']++;

        for(int i=0;i<26;i++)
        System.out.println(arr[i]);
        int odd=0;
        int even=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
        if(arr[i]!=0){
            if(arr[i]%2==1)
            odd=Math.max(odd,arr[i]);
            else 
            even=Math.min(even,arr[i]);
        }
        }
        return odd-even;
    }
}