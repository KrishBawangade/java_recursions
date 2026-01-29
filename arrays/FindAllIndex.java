package arrays;

import java.util.ArrayList;

public class FindAllIndex{
     static ArrayList<Integer> findAllIndex(int[] arr, int target){
        return find(0, arr, target, new ArrayList<>());
    }

    static ArrayList<Integer> find(int idx, int[] arr, int target, ArrayList<Integer> foundIndexList){
        if(idx == arr.length){
            // return found index list if finished search all elements
            return foundIndexList;
        }

        if(arr[idx] == target){
            // if target found add the index in found list
            foundIndexList.add(idx);
        }
        
        return find(idx+1, arr, target, foundIndexList);
        
    }


    public static void main(String[] args){
        int[] arr = {23,5,67,87,87,134};
        int target = 87;

        ArrayList<Integer> foundList = findAllIndex(arr, target);

        if(!foundList.isEmpty()){
            System.out.printf("Element(%d) found at - %s", target, foundList);
        }else{
            System.out.printf("Element(%d) not found!", target);
        }
    }
}