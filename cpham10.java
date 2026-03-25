//Christine Pham
//lab 10


import java.util.*;

public class lab10
{

	public static void main (String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input a number for the radius of a cylinder");
		int radius = keyboard.nextInt();
		System.out.println("Input the number for the height of the cylinder");
		int heightC = keyboard.nextInt();
		double vol = volume(radius, heightC);
		System.out.println("The volume of the cylinder is: " + vol);

		//System.out.println("\nInput a number for the height of a rectangle.");
		//int heightR = keyboard.nextInt();
		//System.out.println("Input a number for the length of the rectangle.");
		//int length = keyboard.nextInt();
		//double ans = area(heightR, length);
		//System.out.println("The area of the rectangle is: " + ans);

		keyboard.close();
	}

	static double volume(int radius, int height)
	{
		double PI = 3.14;
		return PI*height*radius*radius;
	}

	static double area (int length, int height)
	{
		return length * height;
	}

}
