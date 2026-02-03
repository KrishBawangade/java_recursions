package sorts;

import java.util.Arrays;

public class QuickSort{
    static void quickSort(int[] arr, int start, int end){
        // start & end both inclusive
        if(start>=end){
            return;
        }

        int mid = (start + (end - start)/2);
        int pivotIndex = placePivot(arr, mid, start, end);
        quickSort(arr, start, pivotIndex-1); // partition 1
        quickSort(arr, pivotIndex+1, end); // partition 2
    }

    static int placePivot(int[] arr, int pivotIndex, int start, int end){

        int pivot = arr[pivotIndex];

        while(start<end){
            //find the element which is greater than pivot from left
            while(arr[start]<pivot ){
                start++;
            }

            //find the element which is less than pivot from right
            while(arr[end]>pivot){
                end--;
            }

            if(start<end){
                //swap the elements to arrange the pivot in its correct position
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }

        // return the pivot index which is start or end as atlast start == end
        return start;
    }

    public static void main(String[] args){
        int[] arr = {34,2,56,7,3};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}