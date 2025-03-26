//Julen Moss
//
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

double calculate_hypotenuse(double base, double height) {
    return sqrt(base * base + height * height);
}

int main() {
    double base, height, hypotenuse;

    printf("Enter the base of the triangle: ");
    scanf("%lf", &base);

    printf("Enter the height of the triangle: ");
    scanf("%lf", &height);

    hypotenuse = calculate_hypotenuse(base, height);

    printf("The hypotenuse of the triangle is: %.2lf\n", hypotenuse);

    return 0;
}

~          
