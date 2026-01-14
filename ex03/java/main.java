
public class main {
    static boolean isPrime(int number) {
        int div = 0;
        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                div++;
            }
        }
        return (div == 0) ? true : false;
    }
    public static void main(String[] args) {
        long aa = 600851475143L;
        for (int i = 2; i < aa; i++) {
            if (aa % i == 0) {
                if (isPrime(Math.abs(i)))
                    System.out.printf("%d\n", i);
            }
        }
    }
}