package com.DSALGO;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {3,1,5,4};
        insertionSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void insertionSort(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while (j >= 0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
}
