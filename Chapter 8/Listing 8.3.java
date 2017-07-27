public class MainClass {
	public static void main(String[] args) {
		Circle c = new Circle();
		Circle b = new Circle();
		c.radius = 100.0f;
		b.radius = 900.0f;
		System.out.println("Radius of c: " + c.radius); // Prints 100
		System.out.println("Radius of b: " + b.radius); // Prints 900
	}
}