package com.ant.sorts;


/**
 * <p>
 * 归并排序
 * </P>
 *
 * @author Ant
 * @since 2022/12/21 18:00
 **/
public class MergeSort {

    public static void mergeSort(int[] arr, int n) {
        mergeSortC(arr, 0, n-1);
    }

    public static void mergeSortC(int[] sorted, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSortC(sorted, start, mid);
        mergeSortC(sorted, mid + 1, end);

        merge2(sorted, start, mid + 1, end);
    }

    public static void merge(int[] sorted, int index1, int index2, int end) {
        int i = index1, j = index2, k = 0;
        int[] temp = new int[end - index1 + 1];

        while (i < index2 && j <= end) {
            if (sorted[i] < sorted[j]) {
                temp[k++] = sorted[i++];
            } else {
                temp[k++] = sorted[j++];
            }
        }
        int first = i, last = index2 - 1;
        if (j <= end) {
            first = j;
            last = end;
        }

        for (int l = first; l <= last; l++) {
            temp[k++] = sorted[l];
        }

        for (int c = 0; c <= end - index1; c++) {
            sorted[index1 + c] = temp[c];
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {4, 5, 6, 1, 2, 3};
        mergeSort(arr, 6);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }


    public static void merge2(int[] sorted, int index1, int index2, int end) {
        // 临时数组
        int[] tmp = new int[end - index1 + 1];

        int i = index1, j = index2, k = 0;
        for (; i < index2 && j <= end;) {
            if (sorted[i] < sorted[j]) {
                tmp[k++] = sorted[i++];
            } else {
                tmp[k++] = sorted[j++];
            }
        }

        // 剩余部分
        for (; i < index2; i++) {
            tmp[k++] = sorted[i];
        }

        for (; j <= end; j++) {
            tmp[k++] = sorted[j];
        }

        // 数组复制
        for (int l = 0; l <= end -index1 ; l++) {
            sorted[index1+l] = tmp[l];
        }

    }
}
