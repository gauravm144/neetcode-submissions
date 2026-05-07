class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] array=new int[26];
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch=='b'||ch=='a'||ch=='l'||ch=='o'||ch=='n')
            array[ch-'a']++;
        }

        int vb=array['b'-'a'];
        int va=array['a'-'a'];
        int vl=array['l'-'a'];
        int vo=array['o'-'a'];
        int vn=array['n'-'a'];

        if(vb==0||va==0||vl==0||vo==0||vn==0){
            return 0;
        }
        int fst=Math.min(vb,va);
        fst=Math.min(fst,vn);
        int snd=Math.min(vl,vo);
        snd=snd/2;
        return Math.min(fst,snd);
    }
}