public class MainClass {
	public static void main(String[] args) {
		int result = 4;
		result = result - 2;
		result = result * 12;
		result++;
		result = result + result;
		result = result / 7;
		result = result * result;
		result = result * result * result;
		result--;
		// To work out if a number evenly divides another, use mod:
		int mod2 = result % 2;
		int mod3 = result % 3;
		int mod17 = result % 17;
		int mod19 = result % 19;
		int mod43 = result % 43;
		System.out.println("The final result is " + result);
		System.out.println("Division by 2 leaves: " + mod2 + " remainder.");
		System.out.println("Division by 3 leaves: " + mod3 + " remainder.");
		System.out.println("Division by 17 leaves: " + mod17 + " remainder.");
		System.out.println("Division by 19 leaves: " + mod19 + " remainder.");
		System.out.println("Division by 43 leaves: " + mod43 + " remainder.");
	}
}