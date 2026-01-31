package sorts;

import java.util.Arrays;

public class SelectionSort{

    static void sort(int[] arr){
        selectionSort(0, arr, 1, 0);
    }

    static void selectionSort(int pass, int[] arr, int i, int highestIndex){
        if(pass == arr.length-1){
            return;
        }

        if(i<arr.length-pass){
            // change highest element and its index
            if(arr[i]>arr[highestIndex]){
                highestIndex = i;
            }
            selectionSort(pass, arr, i+1, highestIndex);
        }else{
            // swap the highest element in its correct position
            int temp = arr[highestIndex];
            arr[highestIndex] = arr[arr.length-1-pass];
            arr[arr.length-1-pass] = temp;

            selectionSort(pass+1, arr, 1, 0);
        }
    }

    public static void main(String[] args){
        int[] arr = {34,6,23,67,2};
        sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}