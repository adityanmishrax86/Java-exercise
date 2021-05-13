package problems;

import java.util.Scanner;

public class PrintReverse{
    private int num;
    public PrintReverse(){
//        System.out.println("Enter an Integer");
//        Scanner sc = new Scanner(System.in);
//        this.num = sc.nextInt();
    }

    private int reverse(){
        int d, rev = 0;
        int digit = this.num;
        while(digit!=0){
            d = digit % 10;
            rev = rev* 10 + d;
            digit /= 10;
        }
        return rev;
    }

    public static int reverse(int n){
        int d, rev = 0;
        int digit = n;
        while(digit!=0){
            d = digit % 10;
            rev = rev* 10 + d;
            digit /= 10;
        }
        return rev;
    }
}