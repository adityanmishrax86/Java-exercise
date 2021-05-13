package problems;

import java.util.Scanner;

public class BinaryToDecimal {
    private int n;
    private int[] arr;

    public BinaryToDecimal(){
        System.out.println("Enter the number of input");
        Scanner sc = new Scanner(System.in);
        this.n = sc.nextInt();
        this.arr = new int[n];
        for(int i=0;i<n;i++){
            this.arr[i] = sc.nextInt();
        }
    }

    public void getAllElements(){
        // Print all the elements of Array
        for(int i =0; i<this.arr.length; i++){
            System.out.println(this.arr[i]);
        }
    }

    public void convert(){

        for(int i =0; i<this.arr.length; i++){
            int d, sum =0, k=1;
            int num = this.arr[i];
            while(num!= 0){
                d = num%10;
                sum  = sum + d * k;
                num /= 10;
                k = k*2;
            }
            System.out.println(sum);
        }
    }

}
