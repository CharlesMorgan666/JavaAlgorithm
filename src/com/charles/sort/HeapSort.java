package com.charles.sort;

/**InsertSort直接插入排序
 * @author 莫昌廉
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] array = {9, 8, 1, 4, 2, 3, 5, 6, 7, 13, 12, 14, 11, 15, 16, 17, 19, 18, 10};
        PrintArray.print(array);
        insertSort(array);
        PrintArray.print(array);
    }

    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}

