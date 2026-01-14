public class main {
    static boolean isPrime(int number) {
        int div = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                div++;
        }
        return (div == 0);
    }
    public static void main(String[] args) {
        int amntPrimes = 0, i = 2;
        while (amntPrimes < 10001) {
            if (isPrime(i)) {
                amntPrimes++;
                System.out.printf("%d - %d\n", amntPrimes, i);
            }
            i++;
        }
    }
}