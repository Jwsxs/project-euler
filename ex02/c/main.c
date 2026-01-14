#include <stdio.h>

int main() {
    int i = 0, j = 1, sum = 0;

    while (1) {
        if (j > 4000000)
            break;
        if (j % 2 == 0)
            sum += j;

        j = j + i;
        i = j - i;
    }
    printf("The sum is: %i\n", sum);
    return 0;
}