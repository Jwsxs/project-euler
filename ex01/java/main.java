public class main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
            }
        }
        System.out.printf("Sum of all divisors of 3 and 5 below 1000: %d\n", sum);

        // Time of O(n)
    }
}