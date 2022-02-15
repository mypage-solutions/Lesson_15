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
        array.remove(3);
        System.out.println(array);
        IntList array2 = new IntArrayList(5, 17, 1, 69, 0, 233, 799, 125);

        for (int i = 0; i < array2.size() - 1; i++) {
            for (int j = 0; j < array2.size() - i - 1; j++) {
                if (array2.get(j) > array2.get(j + 1)) {
                    int tmp = array2.get(j);
                    array2.set(j, array2.get(j + 1));
                    array2.set(j + 1, tmp);
                }
            }
        }
        System.out.println(array2);
    }
}