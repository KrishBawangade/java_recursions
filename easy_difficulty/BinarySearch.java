public class BinarySearch{

    static int binarySearch(int[] arr, int low, int high, int target){

        if(low>high){
            return -1;
        }

        int mid = low + (high - low)/2 ;
        if(arr[mid] == target){
            return mid;
        }

        if(target>arr[mid]){
            return binarySearch(arr, mid+1, high, target);
        }else{
            return binarySearch(arr, low, mid-1, target);
        }
    }

    public static void main(String[] args){
        int[] arr = {34,6,32,78,3,2,9};
        int target = 1;

        int pos = binarySearch(arr, 0, arr.length, target);

        if(pos==-1){
            System.out.printf("Target (%d) not found in the array!", target);
        }else{
            System.out.printf("Target (%d) found at index %d", target, pos);
        }
    }
}