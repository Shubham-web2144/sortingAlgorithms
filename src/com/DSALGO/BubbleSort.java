package com.DSALGO;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {7,5,8,3,1};
        bubbleSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void bubbleSort(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
//            (arr.length - i - 1) is for ignoring sorted elements
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
//                    Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
