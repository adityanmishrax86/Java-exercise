package arrays;

public class BinarySearch {
    public static int search(int[] arr, int item){
        int low = 0;
        int high = arr.length-1;
        int mid;
        while(low <= high){
            mid = (low+high) / 2;
            if(item == arr[mid])
                return mid;

            if(item < arr[mid]){
                high = mid - 1;
            }else if (arr[mid] < item){
                low = mid + 1;
            }
        }
return -1;
    }
}
