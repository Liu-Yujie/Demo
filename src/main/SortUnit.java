package main;

import util.SortUtil;

public class SortUnit {
    public static void bubbleSort(int[] array,boolean isAsc){
        bubbleSorting(array, isAsc);
    }

    static void bubbleSorting(int[] array, boolean isAsc) {
        if (SortUtil.isEmpty(array)) {
            return;
        }
        int n = array.length;
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (isAsc ? array[j] > array[j + 1] : array[j] < array[j + 1]) {
                    int tem = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tem;
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }

    static void insertingSorting(int[] array, boolean isAsc){
        if (SortUtil.isEmpty(array)) {
            return;
        }
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int value = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (array[j] > value){
                    array[j+1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = value;
        }
    }
}
