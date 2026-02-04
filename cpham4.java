//christine Pham
//csc321
//feb 3 2026

import java.util.*;

public class Lab4
{
	public static void main(String args[])
	{
		System.out.println("input a number to hear: \n1: a joke \n2: a fun fact\n3: something motivating\n4: a dog");
		Scanner keyboard = new Scanner(System.in);

		int usernum = keyboard.nextInt();

		switch (usernum)
		{
			case 1: 
				System.out.println("I know a t-rex who sells guns. Hes a small arms dealer.");
				break;
			case 2: 
				System.out.println("A squid has 3 hearts!");
				break;
			case 3:
				System.out.println("You are filled with determination!");
				break;
			case 4:
				System.out.println("Bark bark bark bark bark");
				break;
		}
		keyboard.close();
	}
}
