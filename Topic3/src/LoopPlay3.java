import java.util.Scanner;

public class LoopPlay3
{
	public static void main(String[] args)
	{
		// Extra Practice: Write a program that is a simple math quiz for adding, subtraction, and multiplication of integer numbers. Give the user 3 times to get the answer correct using a For, While, and Do While Loop. 
		System.out.println("My Math Quiz     v1.0");
		
		// Prompt the user for number 1 and number 2
		Scanner kb = new Scanner(System.in);
		System.out.print("Please specify the first operand: ");
		int number1 = kb.nextInt();
		System.out.print("Please specify the second operand: ");
		int number2 = kb.nextInt();

		// Do addition math quiz and give the user 3 times to get the answer right using a For Loop
		System.out.println("\nAddition Quiz");
		int answer = 0;
		boolean correct = false;
		for(int tries=0;tries < 3;++tries)
		{
			System.out.printf("What is %d + %d? ", number1, number2);
			answer = kb.nextInt();
			if(answer == (number1 + number2))
			{
				correct = true;
				break;
			}
			System.out.println("Incorrect answer. Try again.");
		}
		if(correct)
			System.out.println("You are correct!");
		else
			System.out.println("You are not correct!");

		// Do subtraction math quiz and give the user 3 times to get the answer right using a While Loop
		System.out.println("\nSubtraction Quiz");
		int tries = 0;
		answer = 0;
		correct = false;
		while(tries < 3)
		{
			System.out.printf("What is %d - %d? ", number1, number2);
			answer = kb.nextInt();
			if(answer == (number1 - number2))
			{
				correct = true;
				break;
			}
			++ tries;
			System.out.println("Incorrect answer. Try again.");
		}
		if(correct)
			System.out.println("You are correct!");
		else
			System.out.println("You are not correct!");

		// Do division math quiz and give the user 3 times to get the answer right using a Do While Loop
		System.out.println("Division Quiz");
		tries = 0;
		answer = 0;
		correct = false;
		do
		{
			System.out.printf("\nWhat is %d / %d? ", number1, number2);
			answer = kb.nextInt();
			if(answer == (number1 / number2))
			{
				correct = true;
				break;
			}
			++ tries;
			System.out.println("Incorrect answer. Try again.");
		}while(tries < 3);
		if(correct)
			System.out.println("You are correct!");
		else
			System.out.println("You are not correct!");

		// Cleanup by closing scanner (to avoid a warning in our code too)
		System.out.println("\n\nThank you for taking the quiz!");
		kb.close();
	}
}
