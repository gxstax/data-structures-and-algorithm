package com.ant.sorts;


/**
 * <p>
 * 快速排序
 * </P>
 *
 * @author Ant
 * @since 2022/12/21 19:04
 **/
public class QuickSort {

    public static void quickSort(int[] arr, int n) {
        quickSortC(arr, 0, n - 1);
    }

    private static void quickSortC(int[] arr, int p, int r) {
        if (p >= r) {
            return;
        }

        int pivot = partition(arr, p, r);
        quickSortC(arr, p, pivot - 1);
        quickSortC(arr, pivot + 1, r);
    }

    private static int partition(int[] arr, int p, int r) {
        int pivot = arr[r];
        int i = p;

        for (int j = p; j < r; j++) {
            if (arr[j] < pivot) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
            }
        }
        // 把pivot换到分界处下标位置
        int tmp = arr[i];
        arr[i] = arr[r];
        arr[r] = tmp;
        
        return i;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 6, 5, 4};
        quickSort(arr, 6);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
