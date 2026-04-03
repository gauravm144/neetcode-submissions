class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character,List<Integer>> mp=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(mp.containsKey(ch)){
                List<Integer> l=mp.get(ch);
                l.set(1,i);
            }
            else{
                List<Integer> l=new ArrayList<>();
                l.add(i);
                l.add(i);
                mp.put(ch,l);
            }
        }
        int start=-1,end=-1;
        List<Integer> ans=new ArrayList<>();
        boolean firstiteration=true;
        for(Map.Entry<Character,List<Integer>> entry:mp.entrySet()){
            System.out.println(entry.getKey()+"["+entry.getValue().get(0)+","+entry.getValue().get(1)+"]");
            if(firstiteration){
            start=entry.getValue().get(0);
            end=entry.getValue().get(1);
            firstiteration=false;
            continue;
            }
            
            if(end>entry.getValue().get(0)){
                end=Math.max(end,entry.getValue().get(1));
            }
            else{
                ans.add(end-start+1);
                start=entry.getValue().get(0);
                end=entry.getValue().get(1);
            }
        }
        ans.add(end-start+1);
        return ans;
    }
}
