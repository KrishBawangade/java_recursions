package arrays;
public class FindIsArraySorted{

    static boolean arrayIsSorted(int[] arr){
        return checkSorted(0, arr);
    }

    static boolean checkSorted(int idx, int[] arr){
        if(idx+1>=arr.length){
            // return true if we reached end of the array as no further check possible
            return true;
        }

        if(arr[idx]>arr[idx+1]){
            // if arr[idx]>arr[idx+1] then it means array is not sorted - return false
            return false;
        }else{
            // else check for other elements
            return checkSorted(idx+1, arr);
        }
    }

    public static void main(String[] args){
        int[] arr = {23,45,67,87,99,134};
        System.out.println(arrayIsSorted(arr));
    }
}