class Solution {
    Map<Character,List<Character>> mp=new HashMap<>(); 
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
        return List.of();
        mp.put('2',List.of('a','b','c'));
        mp.put('3',List.of('d','e','f'));
        mp.put('4',List.of('g','h','i'));
        mp.put('5',List.of('j','k','l'));
        mp.put('6',List.of('m','n','o'));
        mp.put('7',List.of('p','q','r','s'));
        mp.put('8',List.of('t','u','v'));
        mp.put('9',List.of('w','x','y','z'));
        List<String> ans=new ArrayList<>();
        find(digits,0,"",mp,ans);
        return ans;
    }
    void find(String digits,int idx,String asf,Map<Character,List<Character>> mp,List<String> ans){
        if(idx==digits.length()){
            System.out.println(asf);
            ans.add(asf);
            return;
        }
        char ch=digits.charAt(idx);
        List<Character> lst=mp.get(ch);
        for(int i=0;i<lst.size();i++){
            find(digits,idx+1,asf+lst.get(i),mp,ans);
        }
    }
}
