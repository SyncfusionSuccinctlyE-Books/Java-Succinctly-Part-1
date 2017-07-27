import java.util.Scanner;
public class MainClass {
	public static void main(String[] args) {
		// Declare all variables
		String userName;
		String userPassword;
		Scanner scanner = new Scanner(System.in);
		
		// Request the user's name
		System.out.print("What is your name? ");
		userName = scanner.nextLine();
		
		// Request the user's password
		System.out.print("Ok, and what is your password? ");
		userPassword = scanner.nextLine();
		
		// Print out the info we read in a message
		System.out.println("Whoa! That was too easy! You're crazy, " +
				userName + ", you just told a complete stranger " + 
				"that your password is " + userPassword + "!");
		
		// Close the scanner to avoid memory leaks
		if(scanner != null)
			scanner.close();
	}
} 