package arrays;

import java.util.*;

public class SubsetWithDuplicate{

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
    
    // Iterative approach for generating the subsets of the given array
    static List<List<Integer>> subset(int[] arr){
        mergeSort(arr, 0, arr.length);
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>()); // initial empty list

        // maintain prev outer size for using it when duplicate element found
        int prevOuterSize = 0;

        for(int i=0; i<arr.length; i++){
            int ele = arr[i];
            int outerSize = subsets.size(); //storing the initial size before updating the list
            int startIdx = 0;

            if(i!=0 && (arr[i-1] == arr[i])){
                // if duplicate found start from the prev outer size
                startIdx = prevOuterSize;
            }

            for(int j=startIdx; j<outerSize; j++){
                List<Integer> subset = subsets.get(j); 
                List<Integer> newSubset = new ArrayList<>(subset); // creating new subsetCopy
                newSubset.add(ele);
                subsets.add(newSubset); // add new subset to subsets list
            }
            // update prev outer size
            prevOuterSize = outerSize;
        }

        return subsets;
    }

    public static void main(String[] args){
        int[] arr = {1,2,2};
        System.out.println(subset(arr));
    }
}