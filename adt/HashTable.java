package com.ava.adt;
import java.util.LinkedList;

class HashTable<K, V> {
    protected LinkedList<Entry<K, V>>[] buckets;
    private int capacity;
    private int size;

    protected static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    public HashTable(int capacity) {
        this.capacity = capacity;
        this.buckets = new LinkedList[capacity];
        this.size = 0;
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void put(K key, V value) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        bucket.add(new Entry<>(key, value));
        size++;
    }

    public V get(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                bucket.remove(entry);
                size--;
                return;
            }
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printHashTable() {
        for (int i = 0; i < capacity; i++) {
            LinkedList<Entry<K, V>> bucket = buckets[i];
            if (!bucket.isEmpty()) {
                System.out.print("Bucket " + i + ": ");
                for (Entry<K, V> entry : bucket) {
                    System.out.print("[" + entry.key + " = " + entry.value + "] ");
                }
                System.out.println();
            }
        }
    }

}