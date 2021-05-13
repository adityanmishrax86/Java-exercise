package problems;

import java.util.Scanner;

public class Calculator {
    private static int a;
    private static int b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give input");
        int sum = 0;
        boolean something = true;
        while (something){
            String op = sc.next();
            char ch = op.charAt(0);
            if(ch == 'x' || ch == 'X')
                break;
            switch (ch) {
                case '*' -> {
                    takeInputs();
                    sum = a * b;
                }
                case '/' -> {
                    takeInputs();
                    sum = a / b;
                }
                case '-' -> {
                    takeInputs();
                    sum = a - b;
                }
                case '+' -> {
                    takeInputs();
                    sum = a + b;
                }

            }
            System.out.println(sum);
        }
    }

    private static void takeInputs(){
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
    }
}
