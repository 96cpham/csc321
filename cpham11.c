// Christine Pham
// lab 11

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

double findHyp(double base, double height);

int main (void)
{
	double base;
	double height;
	double hyp;
	printf("Enter the length of the base of the right triangle.\n");
	scanf("%lf", &base);
	printf("Enter the height of the triangle\n");
	scanf("%lf", &height);

	hyp = findHyp(base, height);

	printf("The length of the hypotenuse is: %.2f \n", hyp);
	return EXIT_SUCCESS;

}

double findHyp(double base, double height)
{
        double squared = base*base + height*height;
        double ans = sqrt(squared);
        return ans;
}
