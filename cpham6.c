//Christine Pham

//both programs evaluate the same because they follow the same order of operations

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void)
{
        int x = 5;
        int y = 6;

	double p = 5;
	double q = 6;

        int answer = x+y*x/y-x;
	double answer2 = p+q*p/q-p;
        printf("int: x+y*x/y-x = %d\n" , answer);
	printf("double: x+y*x/y-x = %f\n" , answer2);

        answer = -x-y/x*y+x;
	answer2 = -p-q/p*q+p;
        printf("int: -x-y/x*y+x = %d\n", answer);
	printf("double: -x-y/x*y+x = %f\n", answer2);

        answer = x+y-x/y;
	answer2 = p+q-p/q;
        printf("int: x+y-x/y = %d\n", answer);
	printf("double: x+y-x/y = %f\n", answer2);

        return EXIT_SUCCESS;
}
