package com.mykhailo;

import java.util.Arrays;

class IntArrayListTest {
    public static void main(String[] args) {
        int[] testArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        IntList testList = new IntArrayList(testArray);
        System.out.println(testList);
        testList.add(10);
        System.out.println(testList);
        testList.set(6, 66);
        System.out.println(testList);
        System.out.println("The element at index 2 is " + testList.get(2));
        System.out.println("The length of a list is " + testList.size());
        testList.add(6, 99);
        System.out.println(testList);
        testList.remove(6);
        System.out.println(testList);
        int[] array = testList.toArray();
        System.out.println(Arrays.toString(array));

        int[] randomArray = {5, 17, 1, 69, 0, 233, 799, 125};
        IntList list = new IntArrayList(randomArray);
        System.out.println("Unsorted list: " + list);

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        System.out.println("Sorted list: " + list);
    }
}