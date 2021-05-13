package arrays;

public class BubbleSort {
    private static void display(int[] arr){
        for(int t:arr)
            System.out.println(t);
    }
    public static void sort(int[] arr){
        int counter;
        for(counter = 0;counter < arr.length -1;counter++){
            for(int j = 0;j < arr.length -1- counter;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        display(arr);
    }
}
