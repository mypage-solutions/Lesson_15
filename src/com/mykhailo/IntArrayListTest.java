package com.mykhailo;

class IntArrayListTest {
    public static void main(String[] args) {
        IntList array = new IntArrayList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        array.add(10);
        array.set(4, 66);
        System.out.println(array.get(2));
        System.out.println(array.size());
        System.out.println(array);
        array.add(3, 99);
        System.out.println(array);
        array.remove(3, 99);
        System.out.println(array);
    }
}