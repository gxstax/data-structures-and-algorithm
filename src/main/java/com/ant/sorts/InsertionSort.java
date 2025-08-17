package com.ant.sorts;


/**
 * <p>
 * 插入排序
 * </P>
 *
 * @author Ant
 * @since 2022/12/21 15:33
 **/
public class InsertionSort {

    /**
     * <p>
     *
     * </p>
     *
     * @param arr   待排序数组
     * @param n     数组长度
     * @return void
     */
    public static void insertSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            // 待排序下标位置的数值
            int value = arr[i];
            // 比对位置的最大下标位置
            int j = i -1;

            // 依次比对
            for (; j >= 0 ; j--) {
                // 因为从 j 下标开始往前的数据都是有序的，所以每对比一次比当前数值大的数就往后移动一次
                if (value < arr[j]) {
                    arr[j+1] = arr[j];
                } else {
                    // 因为从 j 下标开始往前的数据都是有序的，所以当该比对数不小于当前下标，
                    // 更不可能小于更小的下标数，所以直接退出
                    break;
                }
            }
            // 给最后一个移动空出的位置插入数值（如果一次没有移动，那么当前位置还是i，j+1 = i）
            arr[j+1] = value;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {4, 5, 6, 1, 2, 3};
        insertSort2(arr, 6);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }


    public static void insertSort2(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            // 待排序数组下标值
            int value = arr[i];
            // 比对位置最大下标
            int j = i - 1;

            for (; j >= 0; j--) {
                if (value < arr[j]) {
                   arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = value;
        }
    }
}
