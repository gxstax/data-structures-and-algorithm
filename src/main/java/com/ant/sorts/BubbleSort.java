package com.ant.sorts;


/**
 * <p>
 * 冒泡排序
 * </P>
 *
 * @author Ant
 * @since 2022/12/21 15:09
 **/
public class BubbleSort {

    /**
     * <p>
     * 冒泡排序
     * </p>
     *
     * @param a 排序数组
     * @param n 数组大小
     * @return void
     */
    public static void bubbleSort(int[] a, int n) {
        if(n <= 1) {
            return;
        }

        for (int i = 0; i < n; i++) {
            boolean swapFlag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a [j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapFlag = true;
                }
            }

            System.out.println("第" + i + "次排序。。。");
            if (!swapFlag) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 6, 5, 4};
        bubbleSort(arr, 6);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
