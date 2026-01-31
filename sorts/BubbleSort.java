package sorts;

import java.util.Arrays;

public class BubbleSort{

    static void sort(int[] arr){
        bubbleSort(0, arr, 0);
    }

    static void bubbleSort(int pass, int[] arr, int i){
        if(pass == arr.length-1){
            return;
        }

        if(i<arr.length-1-pass){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            bubbleSort(pass, arr, i+1);
        }else{
            bubbleSort(pass+1, arr, 0);
        }
    }

    public static void main(String[] args){
        int[] arr = {34,6,23,67,2};
        sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}