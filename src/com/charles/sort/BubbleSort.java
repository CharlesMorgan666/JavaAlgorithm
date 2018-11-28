package com.charles.sort;

/**BubbleSort冒泡排序
 * @author 莫昌廉
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {9, 8, 1, 4, 2, 3, 5, 6, 7, 13, 12, 14, 11, 15, 16, 17, 19, 18, 10};
        PrintArray.print(array);
        bubbleSort(array);
        PrintArray.print(array);
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array.length-i-1; j++) {
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
}
