package problems;

public class DelhisOddEven {

    private int carNumber;

    public DelhisOddEven(int x){
        this.carNumber = x;
    }

    private int getNumbersSum(int n){
        int d, sum = 0;
        int digit = n;
        while(digit!=0){
            d = digit % 10;
            sum += d;
            digit /= 10;
        }
        return sum;
    }

    public boolean willRunOnSunday() {
        int summed = getNumbersSum(carNumber);
        int evenSum = 0,oddSum = 0;
        
        if(summed % 2 == 0)
            evenSum = summed;
        else
            oddSum = summed;

        if(evenSum % 4==0 && oddSum % 3 == 0)
            return true;

        return false;
    }
}
