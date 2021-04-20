public class LoopPlay1
{
	public static void main(String[] args)
	{
		// Let's use a While loop to simply count by 1's
		//   Discussion: What happens if you do not increment the count? What happens and why? 
		int counter = 0;
		while(counter < 10)
		{
			System.out.println("While loop count is " + counter);
			++counter;
		}

		// Let's do another simple While Loop that counts from 0 up to 10 but only displays the even numbers
		//   Discussion: What happens if you change the condition to be equal to ten? What happened and why? 
		counter = 0;
		while(counter < 10)
		{
			System.out.println("While loop even count is " + counter);
			counter = counter + 2;
		}

		// Let's do the same thing except with a simple For Loop that counts from 0 up to 10
		//   Discussion: What happens if you do not initialize the controlling count variable?
		//   Discussion: What happens if you do not update the controlling count variable?
		for(int count=0;count < 10;++count)
		{
			System.out.println("For loop count is " + count);
		}
		
		// Let's do another simple For Loop that counts from 0 up to 10 but only displays the even numbers
		//   Discussion: How can I include the number 10 in the output
		for(int count=0;count < 10;count = count + 2)
		{
			System.out.println("For loop even count is " + count);
		}

				
		//  TODO: Extra Practice: Use a Do While Loop instead of a For Loop or While Loop in all of the previous examples
		//  TODO: Extra Practice: Write a program that is a simple math quiz for adding, subtraction, and multiplication of integer numbers. Give the user 3 times to get the answer correct using a For, While, and Do While Loop.
	}
}
