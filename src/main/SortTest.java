package main;

import util.SortUtil;

import java.util.Calendar;

public class SortTest {
    public static void main(String[] args) {
        int[] array =  SortUtil.genneratesArray(1000000, 10000000);
        int[] array2 =  array.clone();
        Calendar start;
        Calendar end;
        start = Calendar.getInstance();
        SortUnit.bubbleSort(array,true);
        end = Calendar.getInstance();
        System.out.println("BubbleSort Cost :" + (end.getTimeInMillis() - start.getTimeInMillis()) + "ms");

        start = Calendar.getInstance();
        SortUnit.insertingSorting(array2,true);
        end = Calendar.getInstance();
        System.out.println("InsertingSorting Cost :" + (end.getTimeInMillis() - start.getTimeInMillis()) + "ms");
        /*for (int i : array) {
            System.out.println(i);
        }*/

    }

}
