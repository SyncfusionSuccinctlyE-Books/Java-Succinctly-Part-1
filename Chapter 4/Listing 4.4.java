import java.util.Scanner;
public class MainClass {
	public static void main(String[] args) {
		// Declare all variables
		String userName;
		String userPassword;
		String website;
		Scanner scanner = new Scanner(System.in);

		// Request the user's name
		System.out.print("What is your name? ");
		userName = scanner.nextLine();

		// Request the user's password
		System.out.print("Ok, and what is your password? ");
		userPassword = scanner.nextLine();
		System.out.print("And what website is this the password for? ");
		website = scanner.nextLine();

		// Print out a message:
		System.out.println("Ok, gotta go. I have to quickly check " +
				website + ".");

		// Close the scanner to avoid memory leaks
		if(scanner != null)
			scanner.close();
	}
}