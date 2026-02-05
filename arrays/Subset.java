package arrays;

import java.util.*;

public class Subset{
    
    // Iterative approach for generating the subsets of the given array
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>()); // initial empty list

        for(int ele: arr){
            int outerSize = subsets.size(); //storing the initial size before updating the list

            for(int i=0; i<outerSize; i++){
                List<Integer> subset = subsets.get(i); 
                List<Integer> newSubset = new ArrayList<>(subset); // creating new subsetCopy
                newSubset.add(ele);
                subsets.add(newSubset); // add new subset to subsets list
            }
        }

        return subsets;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3};
        System.out.println(subset(arr));
    }
}