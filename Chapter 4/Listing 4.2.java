public class MainClass {
	
	// Method to return lowest prime factor of the integer x
	private static int GetLowestFactor(int x) {
		int sqrt = (int)Math.sqrt(x);
		if(x % 2 == 0) {
			return 2;
		}
		for(int q = 3; q <= sqrt; q+=2) {
			if(x % q == 0) {
				return q;
			}
		}
		return x;
	}
	
	// Determines if x is prime by seeing if it is equal to
	// it's own lowest factor
	private static Boolean  IsPrime(int x) {
		return GetLowestFactor(x) == x;
	}

	// This program lists the prime numbers in the range 1 to 1000
	public static void main(String[] args) {
		// Declare local variables
		int i = 2, count = 0, countPerLine = 10;
		// Show a description of the program
		System.out.println("Prime numbers from 1 to 1000 are: ");
		// Loop which finds the primes
		while(i <= 1000) {
			// If i is prime...
			if(IsPrime(i)) {
				// Add it to the list...
				System.out.print(i + ", ");
				// Increment the count
				count++;
				// If there's countPerLine items on this line,
				// print a new line.
				if(count % countPerLine == 0) {
					System.out.println();
				}
			}
			// Increment i to the next number
			i++;
		}
	}
}