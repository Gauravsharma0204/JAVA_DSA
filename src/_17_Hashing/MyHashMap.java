package _17_Hashing;

import java.util.LinkedList;

public class MyHashMap<K, V> {

    // Node class
    class Node {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Node>[] hashTable;
    private int elements;
    private int tableSize;
    private double threshold;

    // Constructor
    MyHashMap() {
        elements = 0;
        tableSize = 16;
        threshold = 0.75;
        hashTable = new LinkedList[tableSize];
        initializeHashTable();
    }

    // Initialize table
    private void initializeHashTable() {
        for (int i = 0; i < tableSize; i++) {
            hashTable[i] = new LinkedList<>();
        }
    }

    // Hash function
    private int getHashCode(K key) {
        return Math.abs(key.hashCode()) % tableSize;
    }

    // Search key in bucket
    private int searchKeyInList(K key, int bucketIndex) {
        LinkedList<Node> list = hashTable[bucketIndex];

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).key.equals(key)) {
                return i;
            }
        }
        return -1;
    }

    // PUT
    public void put(K key, V value) {
        int bucketIndex = getHashCode(key);
        int index = searchKeyInList(key, bucketIndex);

        if (index == -1) {
            Node node = new Node(key, value);
            hashTable[bucketIndex].add(node);
            elements++;
        } else {
            hashTable[bucketIndex].get(index).value = value;
        }

        double loadFactor = (double) elements / tableSize;
        if (loadFactor > threshold) {
            rehash();
        }
    }

    // GET
    public V get(K key) {
        int bucketIndex = getHashCode(key);
        int index = searchKeyInList(key, bucketIndex);

        if (index == -1) {
            return null;
        } else {
            return hashTable[bucketIndex].get(index).value;
        }
    }

    // REMOVE
    public V remove(K key) {
        int bucketIndex = getHashCode(key);
        int index = searchKeyInList(key, bucketIndex);

        if (index == -1) {
            return null;
        } else {
            Node removed = hashTable[bucketIndex].remove(index);
            elements--;
            return removed.value;
        }
    }

    // SIZE
    public int size() {
        return elements;
    }

    // REHASH
    private void rehash() {
        LinkedList<Node>[] oldTable = hashTable;

        tableSize = tableSize * 2;
        hashTable = new LinkedList[tableSize];
        initializeHashTable();
        elements = 0;

        for (LinkedList<Node> list : oldTable) {
            for (Node node : list) {
                put(node.key, node.value);
            }
        }
    }

    // DISPLAY (for testing)
    public void display() {
        for (int i = 0; i < tableSize; i++) {
            System.out.print(i + " -> ");
            for (Node node : hashTable[i]) {
                System.out.print("(" + node.key + "," + node.value + ") ");
            }
            System.out.println();
        }
    }

    // MAIN FUNCTION
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("A", 50); // update

        System.out.println("Value of A: " + map.get("A"));
        System.out.println("Value of B: " + map.get("B"));

        map.remove("B");

        System.out.println("Size: " + map.size());

        map.display();
    }
}