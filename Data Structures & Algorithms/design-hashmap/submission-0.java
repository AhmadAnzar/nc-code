class MyHashMap {
    ArrayList<Pair>[] map;
    int size = 10;
    class Pair {
        int key;
        int value;

        Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        map = new ArrayList[size];
        for (int i = 0; i < size; i++) {
            map[i] = new ArrayList<>();
        }
    }

    public int hash(int key) {
        return key % size;
    }

    public void put(int key, int value) {
        int hashed = hash(key);

        for (Pair p : map[hashed]) {
            if (p.key == key) {
                p.value = value;
                return;
            }
        }

        map[hashed].add(new Pair(key, value));
    }

    public int get(int key) {
        int hashed = hash(key);

        for (Pair p : map[hashed]) {
            if (p.key == key) {
                return p.value;
            }
        }

        return -1;
    }

    public void remove(int key) {
        int hashed = hash(key);

        for (int i = 0; i < map[hashed].size(); i++) {
            if (map[hashed].get(i).key == key) {
                map[hashed].remove(i);
                return;
            }
        }
    }
}