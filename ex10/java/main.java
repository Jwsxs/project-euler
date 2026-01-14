public class main{
    static boolean isPrime(int n) {
        for (int i = 3; i * i <= n; i+=2) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        long sum = 2; // starts at 2, becasue 2 is only even prime

        //for starts at 3, and check all odd numbers till 2 million
        for (int i = 3; i < 2000000; i+=2) {
            if (isPrime(i)) sum += i;
        }
        System.out.printf("\n%d\n", sum);
    }
}

// import java.util.Arrays;

// public class main {
//     public static void main(String[] args) {
//         int limit = 2_000_000;
//         boolean[] isPrime = new boolean[limit];
//         Arrays.fill(isPrime, true);
//         isPrime[0] = isPrime[1] = false;
        
//         for (int i = 2; i * i < limit; i++) {
//             if (isPrime[i]) {
//                 for (int j = i * i; j < limit; j += i) {
//                     isPrime[j] = false;
//                 }
//             }
//         }
        
//         long sum = 0;
//         for (int i = 2; i < limit; i++) {
//             if (isPrime[i]) {
//                 sum += i;
//             }
//         }
        
//         System.out.println("Sum of primes below " + limit + ": " + sum);
//     }
// }