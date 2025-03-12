//Julen moss
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    srand(time(0));

    int random_number = rand() % 20 + 1;
    int guess;
    char ch;

    printf("Guess a number between 1 and 20:\n");

    while (1) {
        if (scanf("%d", &guess) != 1) {
            while ((ch = getchar()) != '\n' && ch != EOF);
            printf("You input an invalid number. Please enter a valid number between 1 and 20.\n");
            continue;
        }
        if (guess < 1 || guess > 20) {
            printf("You input a number that is out of range (1-20) re-enter a valid number.\n");
        } else if (guess < random_number) {
            printf("You lost and your guess is lower than my number which was %d. Try again:\n", random_number);
        } else if (guess > random_number) {
            printf("You lost and your guess is higher than my number which was %d. Try again:\n", random_number);
        } else {
            printf("You won and guessed the number correctly!\n");
            for (int i = 0; i < guess; i++) {
                printf("You won and guessed the number correctly!\n");
            }
            break;
        }
    }

    return 0;
}
