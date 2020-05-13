package main;

import util.SortUtil;

public class SortUnit {
    public static void bubbleSort(int[] array, boolean isAsc) {
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

    static void insertingSorting(int[] array, boolean isAsc) {
        if (SortUtil.isEmpty(array)) {
            return;
        }
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int value = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (array[j] > value) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = value;
        }
    }

    public static void quickSorting(int[] array){
        if (SortUtil.isEmpty(array)) {
            return;
        }
        quickSorting_c(array,0,array.length-1);
    }

    public static void quickSorting_c(int[] array,int p, int r){
        if (p >= r) {
            return;
        }
        int q = partition(array,p,r);
        quickSorting_c(array,p,q-1);
        quickSorting_c(array,q+1,r);
    }

    private static int partition(int[] arr, int p, int r) {
        int pivot = arr[r];
        System.out.println("start pivot:" + pivot);
        SortUtil.printArray(arr);
        int i = p;
        for (int j = p; j < r-1; j++) {
            if (arr[j] > pivot){
                int tem = arr[i];
                arr[i] = arr[j];
                arr[j] = tem;
                i += 1;
            }
        }
        arr[r] = arr[i];
        arr[i] = pivot;
        SortUtil.printArray(arr);
        System.out.println("end***");
        return i;
    }
}
