package top.ian.basic;

import top.ian.utils.ArrayUtils;

/**
 * 选择排序
 *
 * @author HuanRong Zheng(huanrong.maybe@gmail.com)
 * @version 2017/4/18
 */
public class SelectionSort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            ArrayUtils.swap(arr, i, minIndex);
        }
    }
}
