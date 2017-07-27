import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String userInput = ""; // User's input string
		int x; // The value of userInput converted to int
		int iterations = 0;// Iterations to reach 1
		int largest = 0; // Largest value reached in computation
		while(true) {
			System.out.println("Enter a number, or 'Q' to quit: ");
			userInput = scanner.nextLine().toLowerCase(); 
			// Allow the user to quit:
			if(userInput.equals("q")) 
				break; 
			x = Integer.parseInt(userInput);

			largest = 0;
			for(iterations = 0; ; iterations++) {

				// If x is even, halve it:
				if(x % 2 == 0)
					x /= 2;

				// Otherwise, x is odd, mul by 3 and increment
				else
					x = (3 * x) + 1;

				// Make sure we do not overflow the int:
				if(x <= 0) {
					System.out.println(
				"Overflow detected, use long for more range...");
					break;
				}

				// If x is > than largest, record new record:
				if(largest < x)
					largest = x;

				// If we find 1, we're done:
				if(x == 1)
					break;
			}
			System.out.println("Reached 1 after " + iterations + 
			" iterations. Largest point reached: " + largest + ".");
		}
	}
}