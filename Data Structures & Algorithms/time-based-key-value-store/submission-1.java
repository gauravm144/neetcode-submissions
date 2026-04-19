// class Node {
//     int time;
//     String value;
//     public Node(int time, String value) {
//         this.time = time;
//         this.value = value;
//     }
// }
// class TimeMap {
//     Map<String,List<Node>> map;
//     public TimeMap() {
//         map=new HashMap<>();
//     }
//     public void set(String key, String value, int timestamp) {
//         List<Node> tmp=map.get(key);
//         if(tmp==null){
//             tmp=new ArrayList<>();
//         }
//         tmp.add(new Node(timestamp,value));
//         map.put(key,tmp);
//     }
    
//     public String get(String key, int timestamp) {
//         if(!map.containsKey(key))
//         return "";

//         List<Node> history = map.get(key);
//         int start = 0;
//         int end = history.size() - 1;
//         String result = "";
//          while (start <= end) {
//             int mid = start + (end - start) / 2;
            
//             if (history.get(mid).time <= timestamp) {
//                 // This is a potential answer! 
//                 result = history.get(mid).value;
//                 // Move right to see if there's a more recent valid timestamp
//                 start = mid + 1;
//             } else {
//                 // Too far in the future, look left
//                 end = mid - 1;
//             }
//         }

//         return result;
//     }
// }
class TimeMap {
    // Map to a list of timestamps and a list of values separately
    // This avoids the overhead of a custom 'Node' object
    private Map<String, List<Integer>> times;
    private Map<String, List<String>> values;

    public TimeMap() {
        times = new HashMap<>();
        values = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        times.computeIfAbsent(key, k -> new ArrayList<>()).add(timestamp);
        values.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }

    public String get(String key, int timestamp) {
        List<Integer> timeList = times.get(key);
        if (timeList == null) return "";

        List<String> valList = values.get(key);
        int n = timeList.size();

        // SPEED HINT: Check the last element first (O(1))
        if (timeList.get(n - 1) <= timestamp) {
            return valList.get(n - 1);
        }
        // If smaller than the first element, return empty
        if (timeList.get(0) > timestamp) {
            return "";
        }

        // Standard Binary Search
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midTime = timeList.get(mid);
            
            if (midTime == timestamp) return valList.get(mid);
            if (midTime < timestamp) left = mid + 1;
            else right = mid - 1;
        }

        return valList.get(right);
    }
}
