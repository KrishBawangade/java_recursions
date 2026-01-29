package arrays;

public class LinearSearch{

    static int linearSearch(int[] arr, int target){
        return findIndex(0, arr, target);
    }

    static int findIndex(int idx, int[] arr, int target){
        if(idx == arr.length){
            return -1;
        }

        if(arr[idx] == target){
            return idx;
        }else{
            return findIndex(idx+1, arr, target);
        }
    }


    public static void main(String[] args){
        int[] arr = {23,45,67,87,99,134};
        int target = 3;

        int pos = linearSearch(arr, target);

        if(pos != -1){
            System.out.printf("Element(%d) found at pos %d", target, pos);
        }else{
            System.out.printf("Element(%d) not found!", target);
        }
    }
}