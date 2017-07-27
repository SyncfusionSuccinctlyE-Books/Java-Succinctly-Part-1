import java.util.Scanner;

public class MainClass {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		// Parameters for the operation
		double parameterA = 0.0, parameterB = 0.0;

		// Index of the operation
		int operation = 0;

		System.out.println("Welcome to Calculator");
		do {

			// Ask the user for two numbers and an operator:
			System.out.print("Type a number: ");
			parameterA = Double.parseDouble(s.nextLine());
			System.out.print("Type another number: ");
			parameterB = Double.parseDouble(s.nextLine());
			System.out.println("Select an option: ");
			System.out.println(
"1. Add\n2. Subtract\n3. Multiply\n4. Divide\n0. Quit");
			System.out.print(": ");

			operation = Integer.parseInt(s.nextLine());

			// Perform the selected operation using switch
			switch(operation){
			case 1: { // If the user selected 1, add the parameters
				System.out.println(parameterA + "+" + parameterB
						+ "=" + (parameterA + parameterB));
				break;
			}
			case 2: { // If 2, subtract the parameters
				System.out.println(parameterA + "-" + parameterB
						+ "=" + (parameterA - parameterB));
				break;
			}
			case 3: { // If 3, multiply the parameters
				System.out.println(parameterA + "*" + parameterB
						+ "=" + (parameterA * parameterB));
				break;
			}
			case 4: { // If 4, divide the parameters
				System.out.println(parameterA + "/" + parameterB
						+ "=" + (parameterA / parameterB));
				break;
			}
			case 0: { // If 0, do nothing, they are quitting
				break;
			}
			default: { // Default option prints an error message
				System.out.println(
						"That wasn't one of the options.");
			}
			}
		} while(operation != 0);

		// The user has quit
		System.out.println("Bye, bye!");
		if(s != null)
			s.close();
	}
}