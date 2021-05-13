package problems;

public class DecimalToOctat {
    public static void convert(int x){
        int d;
        int num = x;
        while(num != 0){
            d = num % 8;
            num = num / 8;
            System.out.println(d);
        }
    }
}
