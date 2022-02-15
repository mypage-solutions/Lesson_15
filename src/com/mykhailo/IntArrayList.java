package com.mykhailo;

import java.util.Arrays;

public class IntArrayList implements IntList {

    private int[] arr = new int[0];

    public IntArrayList() {
    }

    public IntArrayList(int... values) {
        arr = new int[values.length];
        System.arraycopy(values, 0, arr, 0, values.length);
    }

    @Override
    public void add(int value) {
        int[] tempArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, tempArr, 0, arr.length);
        tempArr[tempArr.length - 1] = value;
        arr = tempArr;
    }

    @Override
    public int get(int index) {
        if (index > arr.length - 1 || index < 0) {
            throw new RuntimeException("ArrayIndexOutOfBoundsException");
        }
        return arr[index];
    }

    @Override
    public void set(int index, int value) {
        if (index > arr.length - 1 || index < 0) {
            throw new RuntimeException("ArrayIndexOutOfBoundsException");
        }
        arr[index] = value;
    }

    @Override
    public int size() {
        return arr.length;
    }

    @Override
    public int[] toArray() {

        return arr;
    }

    @Override
    public void add(int index, int value) {
        if (index > arr.length - 1 || index < 0) {
            throw new RuntimeException("ArrayIndexOutOfBoundsException");
        }
        int[] temp = new int[arr.length + 1];
        System.arraycopy(arr, 0, temp, 0, index);
        System.arraycopy(arr, index, temp, index + 1, temp.length - index - 1);
        temp[index] = value;
        arr = temp;
    }

    @Override
    public void remove(int index) {
        if (index > arr.length - 1 || index < 0) {
            throw new RuntimeException("ArrayIndexOutOfBoundsException");
        }
        int[] temp = new int[arr.length - 1];
        System.arraycopy(arr, 0, temp, 0, index);
        System.arraycopy(arr, index + 1, temp, index, temp.length - index);
        arr = temp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntArrayList that = (IntArrayList) o;
        return Arrays.equals(arr, that.arr);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }

    @Override
    public String toString() {
        return "IntArrayList{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
