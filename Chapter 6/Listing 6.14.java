public class MainClass {
	public static void main(String[] args) {
		int eggsTotal = 792671;
		int cartons = eggsTotal / 12;
		int eggsLeftOver = eggsTotal % 12;
		System.out.println("The farmer has " + cartons + " cartons of eggs, "
				+ "and " + eggsLeftOver + " eggs left over for breakfast.");

	}
}