#include <stdio.h>
#include <stdbool.h>

bool isPrime(int number) {
    int div = 0;
    for (int i = number - 1; i > 1; i--) {
        if (number % i == 0) {
            div++;
        }
    }
    return (div == 0) ? true : false;
}

int main() {
    unsigned long aa = 600851475143;

    for (int i = 2; i < aa; i++) {
        if (aa % i == 0)
            if (isPrime(i))
                printf("%i\n", i);
    }
    return 0;
}