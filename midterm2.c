//Julen Moss
//
//
//
#include <stdio.h>
#include <stdlib.h>

void printName(int times);
int main (void){
    int num;

    printf("Enter the number of times to print your name: ");
    scanf("%d", &num);

    printName(num);

    return 0;
}
void printName(int times) {
    for (int i = 0; i < times; i++) {
        printf("Julen Moss\n");
    }
}
