package sorts;

import java.util.Arrays;


public class InplaceMergeSort{

    static void mergeSort(int[] arr, int start, int end){

        if(end-start == 1){
            return;
        }

        int mid = start + (end-start)/2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);

        merge(arr, start, mid, end);
        
    }

    static void merge(int[] arr, int start, int mid, int end){
        // maintain a array to sort the elements
        int[] merged = new int[end-start];

        int i=start, j=mid, k=0;

        while(i<mid && j<end){

            //compare both virtual arrays and insert the smaller element one by one in new array
            if(arr[i]<arr[j]){
                merged[k] = arr[i];
                i++;
            }else{
                merged[k] = arr[j];
                j++;
            }
            k++;
        }

        // insert any remaining elements from any of the virtual array

        while(i<mid){
            merged[k] = arr[i];
            i++;
            k++;
        }

        while(j<end){
            merged[k] = arr[j];
            j++;
            k++;
        }

        // replace the original array part with the sorted array
        j=0;
        for(i=start; i<end; i++){
            arr[i] = merged[j];
            j++;
        }

    }

    public static void main(String[] args){
        int[] arr = {8,3,4,2,5,6};
        
        mergeSort(arr, 0, arr.length);

        System.out.println(Arrays.toString(arr));
    }
}