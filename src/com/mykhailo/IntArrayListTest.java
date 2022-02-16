package com.mykhailo;

import java.util.Arrays;

class IntArrayListTest {
    public static void main(String[] args) {
        int[] array1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        IntList list1 = new IntArrayList(array1);
        System.out.println(list1);
        list1.add(10);
        System.out.println(list1);
        list1.set(6, 66);
        System.out.println(list1);
        System.out.println("The element at index 2 is " + list1.get(2));
        System.out.println("The length of a list is " + list1.size());
        list1.add(6, 99);
        System.out.println(list1);
        list1.remove(6);
        System.out.println(list1);
        int[] array = list1.toArray();
        System.out.println(Arrays.toString(array));

        int[] array2 = {5, 17, 1, 69, 0, 233, 799, 125};
        IntList list2 = new IntArrayList(array2);
        System.out.println("Unsorted list: " + list2);

        for (int i = 0; i < list2.size() - 1; i++) {
            for (int j = 0; j < list2.size() - i - 1; j++) {
                if (list2.get(j) > list2.get(j + 1)) {
                    int temp = list2.get(j);
                    list2.set(j, list2.get(j + 1));
                    list2.set(j + 1, temp);
                }
            }
        }
        System.out.println("Sorted list: " + list2);
    }
}