
public class PlayMultiArrays
{

	public static void main(String[] args)
	{
		// Extra Practice: Working with multidimensional arrays
		// Create a multidimensional array that holds numbers (i.e. ints)
		int rows = 5;
		int columns = 10;
		int[][] numbers = new int[rows][columns];
		
		// Populate a multidimensional array with a number
		//  Note the use of one For loop to iterate thru the rows and an inner For loop to iterate thru the columns of a row
		//  Note how the max rows and max column indexes are calculated
		int number = 0;
		for(int x=0;x < rows;++x)
		{
			for(int y=0;y < columns;++y)
			{
//				System.out.printf("These are the indexes %d,%d\n", x, y);
				numbers[x][y] = number++;
			}
		}

		// Read and display a multidimensional array in reverse order
		//  Note how the starting as well as the max rows and max column indexes are calculated
		for(int x=rows-1;x >= 0;--x)
		{
			for(int y=columns-1;y >= 0;--y)
			{
//				System.out.printf("These are the indexes %d,%d\n", x, y);
				System.out.printf("The value at row %d and column %d is %d\n", x, y, numbers[x][y]);
			}
		}
	}

}
