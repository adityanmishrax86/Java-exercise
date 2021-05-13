package problems;

import java.util.Scanner;

public class IncreasingDecreasingSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of inputs");
        int num = sc.nextInt();
        int[] arr = new int[num];
        boolean isIncDec = false;

        //input to array
        for(int i=0; i<num;i++){
            arr[i] = sc.nextInt();
        }

        for(int k=0; k<arr.length-1;k++){
            if(!(arr[k]+ 1 == arr[k+1]) || !(arr[k] - 1 == arr[k+1]))
                isIncDec = false;
            else
                isIncDec = true;
        }



    }
}
