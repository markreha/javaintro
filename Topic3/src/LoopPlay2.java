public class LoopPlay2
{
	public static void main(String[] args)
	{
		// Extra Practice: Use a Do While Loop instead of a For Loop or While Loop in all of the previous examples
		// Let's do the same thing but use a Do While loop
		//   Discussion: What happens if you do not increment the count? What happens and why? 
		int count = 0;
		do
		{
			System.out.println("Do While loop count is " + count);
			++count;
		}while(count < 10);

		// Let's do another simple While Loop that counts from 0 up to 10 but only displays the even numbers
		//   Discussion: What happens if you change the condition to be equal to ten? What happened and why? 
		count = 0;
		do
		{
			System.out.println("Do While loop even count is " + count);
			count = count + 2;
		}while(count < 10);
	}
}
