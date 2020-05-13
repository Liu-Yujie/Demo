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

    public static void printArray(int[] array){
        if(isEmpty(array)){
            return;
        }
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            str.append(array[i]);
            if(i != array.length-1){
                str.append(",");
            }
        }
        System.out.println(str.toString());
    }
}
