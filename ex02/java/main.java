public class main {
    public static void main(String[] args) {
        int i = 0, j = 1, sum = 0;
        while (true) { 
            if (j > 4000000)
                break;

            System.out.printf("%d, ", j);
            if (j % 2 == 0)
                sum += j;

            j = j + i;
            i = j - i;
        }
        System.out.printf("\n\nSum is %d\n", sum);
    }
}