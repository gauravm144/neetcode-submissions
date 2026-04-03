class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] chars=strs[i].toCharArray();
            Arrays.sort(chars);
            String str=new String(chars);
            if(mp.containsKey(str)==true){
                List<String> lst=mp.get(str);
                lst.add(strs[i]);
            }
            else{
                List<String> lst=new ArrayList();
                lst.add(strs[i]);
                mp.put(str,lst);
            }
        }
        List<List<String>> ans=new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : mp.entrySet()) {
            ans.add(entry.getValue());
            // System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
}
        
        return ans;
    }
}
