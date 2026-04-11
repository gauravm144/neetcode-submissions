class Bucket{
    List<Integer> list;
    public Bucket(){
        list=new LinkedList();
    }
    public void add(Integer val){
        if(this.list.indexOf(val)==-1)
        list.add(val);
    }
    public boolean contain(Integer val){
        return this.list.indexOf(val)!=-1;
    }
    public void remove(Integer val){
        this.list.remove(val);
    }
}
class MyHashSet {
    Bucket[] buckets;
    int hashkey=769;
    public MyHashSet() {
        buckets=new Bucket[hashkey];
        for(int i=0;i<hashkey;i++)
        buckets[i]=new Bucket();
    }
    public int getkey(int val){
        return val%hashkey;
    }
    public void add(int key) {
        buckets[getkey(key)].add(key);
    }
    
    public void remove(int key) {
        buckets[getkey(key)].remove(key);
    }
    
    public boolean contains(int key) {
        return buckets[getkey(key)].contain(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */