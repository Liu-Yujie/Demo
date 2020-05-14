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
        return partition(arr,p,r,false);
    }

    private static int partition(int[] arr, int p, int r,boolean showConsoleLog) {
        int pivot = arr[r];
        if (showConsoleLog){
            System.out.println("---Start---");
            System.out.println("***Start position (p):" + p);
            System.out.println("***Current length of partition - 1 (r):" + r);
            System.out.println("***arr[r] (Pivot):" + pivot);
            SortUtil.printArray(arr,"Primary array: ");
        }
        int i = p;// i point to the bigger one than the pivot
        //j < r + 1 (current length of partition)
        if (showConsoleLog){
            System.out.println("/////////////////////////////////////");
        }
        for (int j = p; j <= r; j++) {
            if (arr[j] < pivot){// j is to find the smaller one than the pivot
                //swap the arr[i] and arr[j]
                if (i != j){
                    int tem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tem;
                    if (showConsoleLog){
                        System.out.println("arr[" + j + "](" + arr[j] + ") < pivot(" + pivot + ")");
                        System.out.println("Swap arr[" + i + "](" + arr[i] + ") with arr[" + j + "](" + arr[j] + ")");
                    }
                }
                i += 1;
                if (showConsoleLog){
                    SortUtil.printArray(arr,"----After " + i + " swap:");
                }
            } else if(showConsoleLog){
                System.out.println("arr[" + j + "](" + arr[j] + ") >= pivot(" + pivot + "), No swap");
            }
            if (showConsoleLog){
                System.out.println("---------------------------------------");
            }
        }
        if (showConsoleLog){
            System.out.println("/////////////////////////////////////");
            //i point to the last bigger one than pivot,swap arr[i] with arr[r]
            System.out.println("Swap arr[" + r + "](" + arr[r] + ") with arr[" + i + "](" + arr[i] + ")");
        }
        if (arr[r] != arr[i]){
            arr[r] = arr[i];
            arr[i] = pivot;
        }
        if (showConsoleLog){
            SortUtil.printArray(arr);
            System.out.println("***Return i = " + i);
            System.out.println("---End---");
            System.out.println();
        }
        return i;
    }

    public static void quickSort(int[] array){
        if (SortUtil.isEmpty(array)){
            return;
        }
        quickSort(array,0,array.length - 1);
    }

    public static void quickSort(int[] array, int low, int high){
        int i,j,tem,t;
        if (low > high){
            return;
        }
        tem = array[low];
        i = low;
        j = high;

        while (i < j){
            //先看右边，依次往左递减
            while (array[j] >= tem && i < j){
                j--;
            }
            //再看左边，依次往右递增
            while (array[i] <= tem && i < j){
                i++;
            }
            //如果满足条件则交换
            if (i < j){
                t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
        }
        //最后将基准为与i和j相等位置的数字交换
        array[low] = array[i];
        array[i] = tem;
        //递归调用左半数组
        quickSort(array,low,j-1);
        //递归调用右半数组
        quickSort(array,j+1,high);
    }
}
