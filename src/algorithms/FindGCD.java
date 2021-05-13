package algorithms;

import java.util.ArrayList;

public class FindGCD {


    // This method follows the Euclid's Algorithm
    public static int findgcd(int m, int n){
        if(n==0)
            return m;
        else{
            int remainder = (m % n);
            m = n;
            n = remainder;
            return findgcd(m,n);
        }
    }

    // Consecutive integer checking algorithm
    public static int findgcdOne(int m, int n){
        // first find the smallest of the two params
        // This method does not work, if one of the input is 0
         if (m == 0 || n ==0)
            return -1;
        // loop through the smallest number of input until we get the result
         for (int smallest = Math.min(m,n); smallest > 0; smallest--){
            if(m% smallest == 0 && n%smallest ==0) {
                return smallest;
            }
        }
        return -1;
    }

    // Middle School Procedure
    /**
     * 1st find the prime factors of m
     * 2nd find the prime factors of n
     * 3rd Identify the common factors and then return it as the gcd
     * ex: 60,24
     * 60: 2.2.3.5
     * 24: 2.2.2.3
     * common: 2.2.3
     */

    private boolean checkPrime(int n){
        int i,m=0,flag=0;
        m=n/2;
        if(n==0||n==1)
            ;
        else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    flag=1;
                    break;
                }
            }
            return flag == 0;
        }
        return false;
    }

    public ArrayList<Integer> findPrimeNumbers(int x) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 2; i <= x;i++){
            if(checkPrime(i)){
                nums.add(i);
            }
        }
        return nums;
    }

    // Find the prime factor of a number
    public void findPrimeFactor(int x){
        ArrayList<Integer> nums = findPrimeNumbers(x);
        ArrayList<Integer> primes = new ArrayList<Integer>();
        int[] arr = new int[nums.size()];
        for(int k =0; k<nums.size(); k++){
            arr[k] = nums.get(k);
        }

        int rem;
        for(int i =0;i<arr.length; i++){
            rem = x % arr[i];
            if(rem != 0){

            }
        }
    }


}
