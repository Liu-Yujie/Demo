package main;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import util.SortUtil;

import java.util.Calendar;

public class SortTest {
    public static void main(String[] args) {
        int[] array =  getArray('A');
        int[] array2 =  array.clone();
        int[] array3 =  array.clone();
        System.out.print("Array:");
        SortUtil.printArray(array);
        Calendar start;
        Calendar end;
        start = Calendar.getInstance();
        SortUnit.quickSorting(array3);
        end = Calendar.getInstance();
        System.out.println("QuickSorting Cost :" + (end.getTimeInMillis() - start.getTimeInMillis()) + "ms");
        SortUtil.printArray(array3);

        start = Calendar.getInstance();
        SortUnit.insertingSorting(array2,true);
        end = Calendar.getInstance();
        System.out.println("InsertingSorting Cost :" + (end.getTimeInMillis() - start.getTimeInMillis()) + "ms");
        SortUtil.printArray(array2);

        start = Calendar.getInstance();
        SortUnit.bubbleSort(array,true);
        end = Calendar.getInstance();
        System.out.println("BubbleSort Cost :" + (end.getTimeInMillis() - start.getTimeInMillis()) + "ms");
        SortUtil.printArray(array);

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
                arr = SortUtil.genneratesArray(1000,1000);
            break;
        }
        return arr;
    }

}
