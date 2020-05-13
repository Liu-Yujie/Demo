package util;

public class SortUtil {

    public static int[] genneratesArray(int len, int max){
        int[] arr=new int[len];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*max);
        }
        return arr;
    }

    public static boolean isEmpty(int[] obj) {
        return obj == null || obj.length <= 1;
    }
}
