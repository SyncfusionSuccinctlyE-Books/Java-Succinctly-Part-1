// Import all classes from java.util
import java.util.*;

public class MainClass {
	public static void main(String[] args) {

		// Declare a pseudo-random number generator called r
		Random r = new Random();


		// Declare a new Scanner called scanner
		Scanner scanner = new Scanner(System.in);

		// Select a random number from 1, 2 or 3
		int doorWithCar = r.nextInt(3) + 1;
		System.out.println("There are three doors before you, " +
				"behind two doors, you will find a goat, but " +
				"behind the third, there is a brand new car!\n");

		// Declare a variable to store the door the user selects
		int selectedDoor = 0;

		// Loop until they guess the right door:
		while (selectedDoor != doorWithCar) {
			System.out.println("Which door would you like to open?");

			// Read a door from the user
			selectedDoor = scanner.nextInt();
			if (selectedDoor < 1 || selectedDoor > 3) {
				System.out.println("The doors are 1, 2 or 3...");
				selectedDoor = 0;
			} else if (selectedDoor == doorWithCar) {
				System.out.println("Yes, you won a car!!!!");
			} else {
				System.out.println("Nope, that's a goat...");
				selectedDoor = 0;
			}
		}
	
	if(scanner != null)
		scanner.close();
	}
}