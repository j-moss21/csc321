//Julen Moss
//
//
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int main(void) {
    int x = 6, y = 12;
    double a = 6.0, b = 12.0;

    printf("Integer evaluation:\n");

    int total1 = x + y * x / y - x;
    printf("x + y * x / y - x = %d\n", total1);
    
    int total2 = -x - y / x * y + x;
    printf("-x - y / x * y + x = %d\n", total2);
    
    int total3 = x + y - x / y;
    printf("x + y - x / y = %d\n", total3);

    printf("\nDouble evaluation:\n");

    double total4 = a + b * a / b - a;
    printf("x + y * x / y - x = %.2f\n", total4);
    
    double total5 = -a - b / a * b + a;
    printf("-x - y / x * y + x = %.2f\n", total5);
    
    double total6 = a + b - a / b;
    printf("x + y - x / y = %.2f\n", total6);
    return 0;
}
