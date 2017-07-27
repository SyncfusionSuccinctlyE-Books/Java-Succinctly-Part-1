public class MainClass {
	public static void main(String[] args) {
		// Use a for loop to count from 1 to 100
		for(int i = 1; i <= 100; i++) {
			// If the number is divisible by 3 and 5, print Fizz!Buzz!
			if(i % 15 == 0) System.out.print("Fizz!Buzz!");
			// Otherwise, if the number is divisible by 3, print Fizz!
			else if(i % 3 == 0) System.out.print("Fizz! ");
			// Otherwise, if the number is divisible by 5, print Buzz!
			else if(i % 5 == 0) System.out.print("Buzz!" );
			// Otherwise, just print the number itself
			else System.out.print(i + " ");
		}
	}
}