class Node {
    int key;   // Essential for Map!
    int val;
    public Node(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

class Bucket {
    List<Node> list;
    public Bucket() {
        list = new LinkedList<>();
    }

    public void put(int key, int val) {
        for (Node node : list) {
            if (node.key == key) {
                node.val = val; // Update existing key
                return;
            }
        }
        list.add(new Node(key, val)); // Add new key-value pair
    }

    public int get(int key) {
        for (Node node : list) {
            if (node.key == key) return node.val;
        }
        return -1; // Standard return if key not found
    }

    public void remove(int key) {
        list.removeIf(node -> node.key == key);
    }
}

class MyHashMap {
    Bucket[] buckets;
    int hashkey = 769;

    public MyHashMap() {
        buckets = new Bucket[hashkey];
        for (int i = 0; i < hashkey; i++)
            buckets[i] = new Bucket(); // Fixed typo from 'bucket' to 'buckets'
    }

    public void put(int key, int value) {
        buckets[key % hashkey].put(key, value);
    }

    public int get(int key) {
        return buckets[key % hashkey].get(key);
    }

    public void remove(int key) {
        buckets[key % hashkey].remove(key);
    }
}
