public class MainClass {
	public static void main(String[] args) {
		// Create a circle with the default constructor
		Circle c = new Circle();
		
		// Create a circle with the (String, radius) constructor
		Circle b = new Circle("Dennis", 55.0f);
		
		// See how many circles we've counted with getCount 
		System.out.println("Number of circles created: " +
 Circle.getCount());
		b.print();		// Call the print method of b
		
		c.setRadius(27.0f);// Call setRadius to set c.radius to 27.0f
		c.setLineWidth(100.6f);	// set c.lineWidth to 100.6f
		System.out.println("Radius of C: " + c.getRadius());

		Circle.zeroCount();	// Calling a static method
		System.out.println(
"Number of circles created: " + Circle.getCount());
		
	}
}