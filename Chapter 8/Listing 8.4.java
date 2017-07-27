public class MainClass {
	public static void main(String[] args) {
		// Declare array of 100 Circles objects
		Circle[] circleArray = new Circle[100];

		// Use a loop to call new and set radiuses
		for(int i = 0; i < 100; i++) {
			circleArray[i] = new Circle();
			circleArray[i].radius = (float)i;
		}
		// Print out a radius as an example
		System.out.println
		("circleArray[20] Radius: " + circleArray[20].radius);
	}
}