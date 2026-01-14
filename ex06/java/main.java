public class main {
    static int squareOfSum(int min, int max) {
        int sum = 0;

        for (int i = min; i <= max; i++) {
            sum += i;
        }

        sum = (int)Math.pow(sum, 2);

        return sum;
    }

    static int sumOfSquares(int min, int max) {
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }
    public static void main(String[] args) {
        int min = 1, max = 100;
        int diff = squareOfSum(min, max) - sumOfSquares(min, max);
        System.out.printf("%d - %d = %d\n", squareOfSum(min, max), sumOfSquares(min, max), diff);
    }
}