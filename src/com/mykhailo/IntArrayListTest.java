package com.mykhailo;

class IntArrayListTest {
    public static void main(String[] args) {
        IntList array1 = new IntArrayList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(array1);
        array1.add(10);
        System.out.println(array1);
        array1.set(4, 66);
        System.out.println(array1);
        System.out.println("The index " + 2 + " contains value: " + array1.get(2));
        System.out.println("The length of an array: " + array1.size());
        System.out.println(array1);
        array1.add(6, 99);
        System.out.println(array1);
        array1.remove(6);
        System.out.println(array1);
        IntList array2 = new IntArrayList(5, 17, 1, 69, 0, 233, 799, 125);
        System.out.println("Unsorted array: " + array2);

        for (int i = 0; i < array2.size() - 1; i++) {
            for (int j = 0; j < array2.size() - i - 1; j++) {
                if (array2.get(j) > array2.get(j + 1)) {
                    int temp = array2.get(j);
                    array2.set(j, array2.get(j + 1));
                    array2.set(j + 1, temp);
                }
            }
        }
        System.out.println("Sorted array:" + array2);
    }
}