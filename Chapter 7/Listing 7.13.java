import java.util.Scanner;
import java.util.InputMismatchException;

public class MainClass {
	public static void main(String[] args)
			throws InputMismatchException, IllegalArgumentException {
		float numerator = 0.0f;
		float denominator = 0.0f;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a numerator: ");
		numerator = s.nextFloat();
		System.out.print("Enter a denomintor: ");
		denominator = s.nextFloat();
		if(denominator == 0.0f)
			throw new IllegalArgumentException();
		System.out.println(numerator + " divided by " + denominator +
				" is equal to " + (numerator / denominator));

		System.out.println("Thank you for your time.");
	}
}