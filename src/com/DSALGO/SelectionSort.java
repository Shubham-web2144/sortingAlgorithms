package com.DSALGO;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7,2,5,1};
        selectionSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void selectionSort(int arr[]) {
        for(int i = 0; i < arr.length-1; i++) {
            int minVal = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minVal]) {
                    minVal = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minVal];
            arr[minVal] = temp;
        }
    }
}
