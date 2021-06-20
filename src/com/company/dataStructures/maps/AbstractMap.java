package com.company.dataStructures.maps;

public abstract class AbstractMap<K,V> implements Map<K,V> {

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    protected static  class MapEntry<K,V> implements java.util.Map.Entry<K,V>{

        private K k;

        private V v;

        public MapEntry(K key,V value){
            k = key;
            v = value;
        }

        @Override
        public K getKey() {
            return k;
        }

        @Override
        public V getValue() {
            return v;
        }

        @Override
        public V setValue(V v) {
            return v;
        }
    }
}
