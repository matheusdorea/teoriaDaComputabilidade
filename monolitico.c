#include <stdio.h>

int fatorialMonolitico(int n) {
    int resultado = 1;
    int i = 1;

r1: // verificação
    if (i > n) goto r3;
    goto r2;

r2: // multiplicação
    resultado *= i;
    i++;
    goto r1;

r3: // fim
    return resultado;
}

int main() {
    int num = 3;
    int fat = fatorialMonolitico(num);
    printf("Fatorial de %d é %d\n", num, fat);
    return 0;
}