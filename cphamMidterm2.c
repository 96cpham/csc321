//Christine Pham
//Midterm 2

#include <stdio.h>
#include <stdlib.h>

void printName(int num);


int main (void)
{

	int input;
	printf("Enter a number: ");
	scanf("%d", &input);
	printName(input);
}

void printName(int num)
{
	int counter = 9;
	while (counter != 0)
	{
		printf("Christine%d\n", num);
		counter--;
	}
}

