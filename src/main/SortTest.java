package main;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import util.SortUtil;

import java.util.Calendar;

public class SortTest {
    public static void main(String[] args) {
        int[] array =  getArray('B');
        int[] array2 =  array.clone();
        int[] array3 =  array.clone();
        int[] array4 =  array.clone();
        int[] array5 =  array.clone();
        System.out.println("length of Array:" + array.length);
        //SortUtil.printArray(array);
        Calendar start;
        Calendar end;

        //归并排序
        start = Calendar.getInstance();
        SortUnit.mergeSort(array5);
        end = Calendar.getInstance();
        System.out.println("归并排序 耗时 :" + (end.getTimeInMillis() - start.getTimeInMillis()) + "ms");
        //SortUtil.printArray(array5,"finally : ");

        //快排
        start = Calendar.getInstance();
        SortUnit.quickSorting(array4);
        end = Calendar.getInstance();
        System.out.println("快排 耗时 :" + (end.getTimeInMillis() - start.getTimeInMillis()) + "ms");
        //SortUtil.printArray(array4);

        //快速排序（双路扫描）
        start = Calendar.getInstance();
        SortUnit.quickSort(array3);
        end = Calendar.getInstance();
        System.out.println("快速排序（双路扫描）耗时 :" + (end.getTimeInMillis() - start.getTimeInMillis()) + "ms");
        //SortUtil.printArray(array3);

        //插排
        start = Calendar.getInstance();
        //SortUnit.insertingSorting(array2,true);
        end = Calendar.getInstance();
        System.out.println("InsertingSorting 耗时 :" + (end.getTimeInMillis() - start.getTimeInMillis()) + "ms");
        //SortUtil.printArray(array2);

        //冒泡
        start = Calendar.getInstance();
        //SortUnit.bubbleSort(array,true);
        end = Calendar.getInstance();
        System.out.println("BubbleSort 耗时 :" + (end.getTimeInMillis() - start.getTimeInMillis()) + "ms");
        //SortUtil.printArray(array);

        /*for (int i : array) {
            System.out.println(i);
        }*/

    }

    private static int[] getArray(char option){
        int[] arr = null;
        switch (option){
            case 'A':
                arr = new int[]{8,10,2,3,6,1,5};
                break;
            case 'B':
                arr = SortUtil.genneratesArray(10000000,1000000000);
                break;
        }
        return arr;
    }

}
