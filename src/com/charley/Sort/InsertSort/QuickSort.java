package com.charley.Sort.InsertSort;

import javafx.beans.binding.When;

/**
 * QuickSort快排
 * 快排是在冒泡排序的基础上加入二分法的思想形成的
 *
 * @author 莫昌廉
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {9, 8, 1, 4, 2, 3, 5, 6, 7, 13, 12, 14, 11, 15, 16, 17, 19, 18, 10};
        PrintArray.print(array);
        quickSort(array, 0, array.length - 1);
        PrintArray.print(array);
    }

    /**
     * 快排
     *
     * @param array
     * @param low   指向第一个元素
     * @param high  指向最后一个元素
     */
    public static void quickSort(int[] array, int low, int high) {
        if(low>=high)
        {
            return;
        }
        // 设置最左边的元素为基准值
        int key = array[low];
        // 数组中比 key 小的放在左边，比 key 大的放在右边，key 值下标为 l
        int l = low;
        int h = high;
        while (l < h) {
            //h 向左移，直到遇到比 key 小的值
            while (array[h] >= key && l < h) {
                h--;
            }
            // l 向右移，直到遇到比 key 大的值
            while (array[l] <= key && l < h) {
                l++;
            }
            // l 和 h 指向的元素交换
            if (l < h) {
                int temp = array[l];
                array[l] = array[h];
                array[h] = temp;
            }
        }
        array[low] = array[l];
        array[l] = key;
        quickSort(array, low, l - 1);
        quickSort(array, l + 1, high);
    }
}
