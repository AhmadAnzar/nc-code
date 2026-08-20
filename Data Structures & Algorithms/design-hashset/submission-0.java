class MyHashSet {
    int key;
    List<Integer>[] set;

    public MyHashSet() {
        this.key = 10;
        this.set = (ArrayList<Integer>[]) new ArrayList[10];
        for (int i = 0; i < 10; i++) {
            this.set[i] = new ArrayList<Integer>();
        }
    }

    public int hash(int val) {
        return val % 10;
    }
    public void add(int key) {
        int hashed = hash(key);
        List<Integer> list = set[hashed];
        if (!list.contains(key)) {
            list.add(key);
        }
    }

    public void remove(int key) {
        int hashed = hash(key);
        List<Integer> list = set[hashed];
        list.remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        int hashed = hash(key);
        List<Integer> list = set[hashed];
        return list.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */