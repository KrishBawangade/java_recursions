package sorts;

import java.util.Arrays;


public class MergeSort{

    static int[] mergeSort(int[] arr){

        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        // divide the array in 2 parts
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        // merge the divided parts
        int[] merged = merge(left, right);

        return merged;
        
    }

    static int[] merge(int[] arr1, int[] arr2){
        // maintain a new array of size arr1.length + arr2.length
        int[] merged = new int[arr1.length + arr2.length];

        int i=0, j=0, k=0;

        while(i<arr1.length && j<arr2.length){

            //compare both arrays and insert the smaller element one by one in new array
            if(arr1[i]<arr2[j]){
                merged[k] = arr1[i];
                i++;
            }else{
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }

        // insert any remaining elements from any of the array

        while(i<arr1.length){
            merged[k] = arr1[i];
            i++;
            k++;
        }

        while(j<arr2.length){
            merged[k] = arr2[j];
            j++;
            k++;
        }
        
        
        return merged;
    }

    public static void main(String[] args){
        int[] arr = {8,3,4,2,5,6};
        
       int[] sorted = mergeSort(arr);

        System.out.println(Arrays.toString(sorted));
    }
}