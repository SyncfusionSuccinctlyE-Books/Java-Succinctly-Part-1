import java.util.Scanner;
import java.util.InputMismatchException;

public class MainClass {
	public static void main(String[] args) {
		float numerator = 0.0f;
		float denominator = 0.0f;
		Scanner s = new Scanner(System.in);

		// Try to execute some code block:
		try {
			System.out.print("Enter a numerator: ");
			numerator = s.nextFloat();
			System.out.print("Enter a denomintor: ");
			denominator = s.nextFloat();
			if(denominator == 0.0f)
				throw new IllegalArgumentException();
			System.out.println(numerator + " divided by " + denominator +
					" is equal to " + (numerator / denominator));
		}

		// If an InputMismatchException is thrown
		catch (InputMismatchException e) {
			System.out.println("Your input was not a float.");
		}

		// If an IllegalArgumentException is thrown
		catch (IllegalArgumentException e) {
			System.out.println
			("The result of division by Zero is not defined.");
		}

		// If any other type of exception is thrown
		catch (Exception e) {
			System.out.println
			("An exception was thrown: " + e.getMessage());
		}

		// After we perform try and catch:
		finally {
			if(s != null)
				s.close();
		}
		System.out.println("Thank you for your time."); 
	}
}