//Christine Pham
//midterm


import java.util.*;

public class Midterm1
{
	public static void main (String args[])
	{
		int x = 14;
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Guess the number I am thinking of between 10 - 20");

		int userNum = keyboard.nextInt();

		if (userNum == x)
		{
			System.out.println("You win! That was my number!");
		}

		if (userNum > x)
		{
			System.out.printf("You guessed too high :( \n You lose \n My number was %d", x);
		}
		if (userNum < x)
		{
			System.out.printf("You guessed too low :( \n You lose \n My number was %d", x);
		}

		keyboard.close();
	}
}
