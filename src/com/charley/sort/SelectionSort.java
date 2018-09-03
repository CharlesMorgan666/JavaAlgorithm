package com.charley.sort;

/**
 * 简单选择排序
 *
 * @author 莫昌廉
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {9, 8, 1, 4, 2, 3, 5, 6, 7, 13, 12, 14, 11, 15, 16, 17, 19, 18, 10};
        PrintArray.print(array);
        selectionSort(array);
        PrintArray.print(array);
    }

    /**
     * 简单选择排序
     *
     * @param array
     */
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            if (i != min) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }
}
