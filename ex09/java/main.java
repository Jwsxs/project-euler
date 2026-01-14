public class main {

    static int pythagoreanTriplet(int a, int b, int c) {
        if ((a < b) && (b < c)) {
            int aSqr = a * a;
            int bSqr = b * b;
            int cSqr = c * c;

            if (cSqr == aSqr + bSqr) {
                System.out.printf("%d + %d == %d\n", aSqr, bSqr, cSqr);
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 250; i++) {
            for (int j = i; j < 500; j++) {
                int k = 1000 - i - j;
                if (k > j) {
                    System.out.printf("Testing i:%d j: %d k: %d\n", i, j, k);
                    if (pythagoreanTriplet(i, j, k) == 0) {
                        System.out.printf("%d\n", i * j * k);
                        return;
                    }
                }
            }
        }
    }
}