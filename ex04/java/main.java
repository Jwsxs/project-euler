
public class main {
    static boolean checkPalindrome(String str) {
        boolean pal = true;
        char[] strArray = str.toCharArray();

        for (int i = 0, j = strArray.length - 1; i < strArray.length; i++, j--) {
            if (strArray[i] == ' ')
                i++;
            if (strArray[j] == ' ')
                j--;
            
            if (strArray[i] == strArray[j]) {
                // System.out.printf("  %d and %d -> '%c' == '%c' - Yes\n", i, j, strArray[i], strArray[j]);
            } else {
                // System.out.printf("> %d and %d -> '%c' != '%c' - No\n", i, j, strArray[i], strArray[j]);
                pal = false;
            }
        }
        return pal;
    }
    public static void main(String[] args) {
        int largest = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int mult = i * j;
                if (checkPalindrome(Integer.toString(mult)) && mult > largest)
                    largest = mult;
            }
        }
    }
}