//Christine Pham
//lab #6

//both programs evaluate the same because they both follow the rules of PEMDAS when evaluated

import java.util.*;

public class Lab6
{
	public static void main(String args[])
	{
		int x = 5;
		int y = 6;

		double p = 5;
		double q = 6;

		int answer = x+y*x/y-x;
		double answer2 = p+q*p/q-p;
		System.out.printf("int: x+y*x/y-x = %d\n", answer);
		System.out.printf("double: x+y*x/y-x = %f\n", answer2);

		answer = -x-y/x*y+x;
		answer2 = -p-q/p*q+p;
		System.out.printf("int: -x-y/x*y+x = %d\n", answer);
		System.out.printf("double: -x-y/x*y+x = %f\n", answer2);

		answer = x+y-x/y;
		answer2 = p+q-p/q;
		System.out.printf("int: x+y-x/y = %d\n", answer);
		System.out.printf("double: x+y-x/y = %f\n", answer2);
	}
}

