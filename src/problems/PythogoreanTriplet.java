package problems;

public class PythogoreanTriplet {

    public static void findTriplet(int m){
        /**
         * The general formula to find the triplet if two nos given
         * m^2-n^2,2mn,m^2+n^2
         * s.t m > n > 0
         *
         * This will print any three triplets
         */
        if(m <= 1) {
            System.out.println("Input must be greater than one");
            return;
        }

        int n = 1;

        System.out.println(m + " " + n);
        System.out.println("The triplets are:");
        System.out.println((int)(Math.pow(m,2)-Math.pow(n,2)));
        System.out.println((2*m*n));
        System.out.println((int)(Math.pow(m,2)+Math.pow(n,2)));
    }

    public static void findCorrespondingTriplets(int N){
        /**
         * To get corresponding triplets following observations are followed from above function
         * n === 1
         * 2mn % 2 === 0
         * so if N is even put it to 2mn, then m = N/2, n =1 & m = 1, n = N/2
         * (N/2)^2 - 1,N,(N/2)^2 + 1
         * if N is odd, then it should be m^2 - n^2
         * N * 1 = (m+n)(m-n)
         * N = m+n, 1 = m-n => m = (N + 1)/2, n = (N-1)/2
         */
        if(N <= 2){
            System.out.println("Must be greater than one");
            return;
        }
        if(N % 2 == 0){
            System.out.println((int)(Math.pow(N/2,2)-1));
            System.out.println((int)(Math.pow(N/2,2)+1));
        }else {
            System.out.println((int)(2*((N+1)/2)*((N-1)/2)));
            System.out.println((int)(Math.pow((N+1)/2,2)+ (int)(Math.pow((N-1)/2,2))));
        }

//
    }
}

