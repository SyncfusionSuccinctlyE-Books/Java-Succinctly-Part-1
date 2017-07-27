import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		// Declare local variables
		Scanner scanner = new Scanner(System.in); // For reading input
		String playerInput = ""; // Variable for reading player input
		int sticks = 37; // Current number of sticks left

		// Print some instructions:
		System.out.println("Remove 1, 2 or 3 sticks from a pile.");
		System.out.println("The player who takes the final stick");
		System.out.println("is the winner!");

		// Main game loop:
		while(true) {
		// Tell the user how many sticks are left, and print a prompt
			System.out.println("There are " + sticks + " left. ");
			System.out.print("How many would you like to take? ");

			// Read the user's input
			playerInput = scanner.nextLine();

			// Subtract the number of sticks the player chose:
			if(playerInput.equals("1"))
				sticks--;
			else if(playerInput.equals("2"))
				sticks-=2;
			else if(playerInput.equals("3"))
				sticks-=3;

		// If they did not select 1, 2 or 3, ask them to select again:
			else {
				System.out.println
				("You can only take 1, 2, or 3 sticks...\n");
				continue;
			}
			// Did the player win?
			if(sticks == 0) {
				System.out.println("You took the last stick, you win!");
				break;
			}
			// If the player did not win, it's the computer's turn:
			if(sticks % 4 != 0) {
				// Print the player's and the computer's moves
				System.out.println
				("Ok, you take " + playerInput + ", I'll take " +
						(sticks % 4) + ".");

				// Subtract the computer's move from the pile:
				sticks -= (sticks % 4);
			}
			else {
				// We have lost unless the player makes a mistake!
				// Select a random number of sticks to subtract:

				int take = (int)(Math.random() * 3.0) + 1;

				// Print out the player's and computer's moves
				System.out.println
				("Ok, you take " + playerInput +
						", I'll take " + take + ".");

				// Subtract the computer's move from the pile:
				sticks-=take;
			}

		// If the computer just took the last stick, the player loses!
			if(sticks == 0) {
				System.out.println("I took the last stick, I win!");
				break;
			}
		}
	}
}