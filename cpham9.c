//Christine Pham
//lab 9

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main (void)
{
	srand(time(NULL));
	int a = rand() %21;
	int guess;

	printf("Guess my number, between 1 and 20\n");
	scanf("%d", &guess);

	while (guess > 20 || guess < 1)
	{
		printf("Invalid input. Try again\n");
		scanf("%d", &guess);
	}

	if (guess < a)
	{
		printf("You lose. You guessed too low. My number was %d", a);
	}
	if (guess > a)
	{
		printf("You lose. You guessed too high. My number was %d", a);
	}
	if (guess == a)
	{
		for (int i =0; i < a; i++)
		{
			printf("That was my number!\n");
		}
	}
	return EXIT_SUCCESS;
}
