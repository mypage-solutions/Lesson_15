package com.mykhailo;

import java.util.Arrays;

class IntArrayListTest {
    public static void main(String[] args) {
        IntList list1 = new IntArrayList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(list1);
        list1.add(10);
        System.out.println(list1);
        list1.set(4, 66);
        System.out.println(list1);
        System.out.println("The index " + 2 + " contains value: " + list1.get(2));
        System.out.println("The length of a list: " + list1.size());
        System.out.println(list1);
        list1.add(6, 99);
        System.out.println(list1);
        list1.remove(6);
        System.out.println(list1);
        IntList list3 = new IntArrayList(5, 17, 1, 69, 0, 233, 799, 125);
        System.out.println("Unsorted list: " + list3);

        for (int i = 0; i < list3.size() - 1; i++) {
            for (int j = 0; j < list3.size() - i - 1; j++) {
                if (list3.get(j) > list3.get(j + 1)) {
                    int temp = list3.get(j);
                    list3.set(j, list3.get(j + 1));
                    list3.set(j + 1, temp);
                }
            }
        }
        System.out.println("Sorted array:" + list3);
    }
}