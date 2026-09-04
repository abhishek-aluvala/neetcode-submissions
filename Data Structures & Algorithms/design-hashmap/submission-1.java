class MyHashMap {
    private int[] keys;
    private int[] values;
    public MyHashMap() {
        keys = new int[1000001];
        values = new int[1000001];

        for(int i = 0; i < keys.length; i++) {
            keys[i] = -1;
        }
    }
    
    public void put(int key, int value) {
        keys[key]=key;
        values[key]=value;
    }
    
    public int get(int key) {
        if(keys[key]==-1){
            return -1;
        }
        return values[key];
    }


    
    public void remove(int key) {
        keys[key]=-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */