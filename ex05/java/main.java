public class main {
    public static void main(String[] args) {
        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            int divs = 0;
            for (int j = 1; j < 21; j++) {
                if (i % j == 0)
                    divs++;
                else
                    divs = 0;
                if (divs == 20) {
                    System.out.printf("%d\n", i);
                    return;
                }
            }
        }
    }
}