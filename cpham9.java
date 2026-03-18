//Christine Pham
//lab 9

import java.util.*;

public class lab9
{
	public static void main(String args[])
	{
		Random randy = new Random();
		int a = randy.nextInt(1, 21);
		System.out.println("Guess my number. Its between 1 and 20");
		Scanner keyboard = new Scanner (System.in);
		int guess = keyboard.nextInt();
		while (guess < 1 || guess > 20)
		{
			System.out.println("\nNumber is not 1-20. Try again.");
			guess = keyboard.nextInt();
		}

		if (guess > a)
		{
			System.out.println("You lose, you guessed too high. My number was " + a);
		}

		if (guess < a)
		{
			System.out.println("You lose, you guessed too low. My number was " + a);
		}
		if (guess == a)
		{
			for (int i = 0; i < a; i++)
			{
			System.out.println("You win! That was my number.");
			}
		}
	}
}
