public class MainClass {
	public static void main(String[] args) {
		// Set str to the string "7"
		String str = "7";
		
		// Set j to the integer 10 + "7" parsed to int
		int j = 10 + Integer.parseInt(str);
		
		// Set c to the character '7'
		char c = '7';
		
		// Set i to 10 + 7, notice we subtract the
		// character '0' from '7' to get the int 7
		// from the character '7' instead of parsing
 
		int i = 10 + c - '0'; 

		// Both j and i are set to 17
		System.out.println("j: " + j);
		System.out.println("i: " + i);
	}
}