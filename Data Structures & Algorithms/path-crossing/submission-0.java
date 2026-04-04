class Pair{
    int x;
    int y;
    public Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public boolean equals(Object o){
        if(this==o)
        return true;
        if(!(o instanceof Pair))
        return false;
        Pair p=(Pair)o;
        return x==p.x&&y==p.y;
    }
    @Override
    public int hashCode(){
        return Objects.hash(x,y);
    }
}
class Solution {
    public boolean isPathCrossing(String path) {
        Set<Pair> set=new HashSet<>();
        set.add(new Pair(0,0));
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char ch=path.charAt(i);
            if(ch=='N'){
                y++;
            }
            else if(ch=='E'){
                x++;
            }
            else if(ch=='S'){
                y--;
            }
            else if(ch=='W'){
                x--;
            }
            if(set.contains(new Pair(x,y))==true)
            return true;
            else
            set.add(new Pair(x,y));
        }
        return false;
    }
}