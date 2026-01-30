package arrays;

public class RotatedBinarySearch{

    static int binarySearch(int[] arr, int target, int low, int high){
        int mid = low + (high-low)/2;

        if(low>high){
            return -1;
        }

        // if target found return index
        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid]>=arr[low]){
            // if middle element is greater than low than we need to check the 1st sorted part 
            if(target< arr[mid] && target >= arr[low] ){
                high = mid -1;
            }else{
                low = mid+1;
            }
        }else{
            // else we need to check the 2nd sorted part
            if(target> arr[mid] && target<=arr[high]){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }

        return binarySearch(arr, target, low, high);
    }

    public static void main(String[] args){
        int[] arr = {5,6,7,8,1,2,3};
        int target = 3;

        System.out.println(binarySearch(arr, target, 0, arr.length-1));
    }
}