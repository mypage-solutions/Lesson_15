package com.mykhailo;

public interface IntList {
    void add(int value);

    int get(int index);

    void set(int index, int value);

    int size();

    int[] toArray();

    void add(int index, int value);

    void remove(int index);
}
