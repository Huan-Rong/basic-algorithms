package top.ian.utils;

/**
 * @author HuanRong Zheng(huanrong.maybe@gmail.com)
 * @version 2017/4/18
 */
public class ArrayUtils {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] generateIntArray(int length, int rangeL, int rangeR) {
        if (length <= 0) {
            throw new IllegalArgumentException("参数 length 必须为正整数。");
        }
        if (rangeL - rangeR > 0) {
            throw new IllegalArgumentException("参数 rangeR 的值必须比参数 rangeL 的值大。");
        }
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = rangeL + (int) (Math.random() * ((rangeR - rangeL) + 1));
        }
        return arr;
    }

    public static int[] copyOf(int[] arr) {
        if (arr == null) {
            throw new NullPointerException("参数 arr 不能为 null。");
        }
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }
        return array;
    }

    public static boolean isOrdered(int[] arr) {
        if (arr == null) {
            throw new NullPointerException("参数 arr 不能为 null。");
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}
