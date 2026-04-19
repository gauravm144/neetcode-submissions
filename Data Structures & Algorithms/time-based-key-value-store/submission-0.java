class Node {
    int time;
    String value;
    public Node(int time, String value) {
        this.time = time;
        this.value = value;
    }
}
class TimeMap {
    Map<String,List<Node>> map;
    public TimeMap() {
        map=new HashMap<>();
    }
    public void set(String key, String value, int timestamp) {
        List<Node> tmp=map.get(key);
        if(tmp==null){
            tmp=new ArrayList<>();
        }
        tmp.add(new Node(timestamp,value));
        map.put(key,tmp);
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key))
        return "";

        List<Node> history = map.get(key);
        int start = 0;
        int end = history.size() - 1;
        String result = "";
         while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (history.get(mid).time <= timestamp) {
                // This is a potential answer! 
                result = history.get(mid).value;
                // Move right to see if there's a more recent valid timestamp
                start = mid + 1;
            } else {
                // Too far in the future, look left
                end = mid - 1;
            }
        }

        return result;
    }
}
