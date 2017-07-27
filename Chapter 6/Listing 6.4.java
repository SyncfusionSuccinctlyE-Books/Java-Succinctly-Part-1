public class MainClass {
	public static void main(String[] args) {
		int numerator = 24;
		int denominator = 5;
		
		int wholeResult = numerator / denominator;
		int fractionalResult = numerator % denominator;
	
		System.out.println("The result is " + wholeResult + " and " +
			fractionalResult + "/" + denominator);
	}
}