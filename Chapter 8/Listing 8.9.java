public class MainClass {
	public static void main(String[] args) {
		// Create an instance of Insect called i
		Insect i = new Insect();
		// Change the insect class's members:
		i.antennas = false;
		i.numberOfLegs = 100;
		// Call the Insect's Print method:
		i.Print();
		// Change the parent class's requiresFood member:
		i.requiresFood = false;
	}
}