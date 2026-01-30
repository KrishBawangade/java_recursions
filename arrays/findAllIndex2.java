package arrays;

import java.util.ArrayList;

public class FindAllIndex2{
     static ArrayList<Integer> findAllIndex2(int[] arr, int target){
        return find(0, arr, target);
    }

    static ArrayList<Integer> find(int idx, int[] arr, int target){
        ArrayList<Integer> foundIndexList = new ArrayList<>();
        if(idx == arr.length){
            // return found index list if finished search all elements
            return foundIndexList;
        }

        if(arr[idx] == target){
            // if target found add the index in found list
            foundIndexList.add(idx);
        }
        foundIndexList.addAll(find(idx+1, arr, target));

        return foundIndexList;
        
    }


    public static void main(String[] args){
        int[] arr = {23,5,67,87,87,134};
        int target = 87;

        ArrayList<Integer> foundList = findAllIndex2(arr, target);

        if(!foundList.isEmpty()){
            System.out.printf("Element(%d) found at - %s", target, foundList);
        }else{
            System.out.printf("Element(%d) not found!", target);
        }
    }
}