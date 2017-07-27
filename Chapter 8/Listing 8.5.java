public class Circle {
	private float radius;
	private String name;
	private float lineWidth;
	private static int circleCount;

	// Constructors:
	
	// Default Constructor
	public Circle() {
		this.radius = 0.0f;
		this.name = "No name";
		this.lineWidth = 0.0f;
		circleCount++;
	}
	// Two argument constructor
	public Circle(String name, float radius) {
		this.radius = radius;
		this.name = name;
		this.lineWidth = 0.0f;
		circleCount++;
	}

	// Methods
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public float getRadius() {
		return radius;
	}
	public void print(){
		System.out.println("Circle: " + name + " Rad: " + radius);
	}
	protected void setLineWidth(float newWidth) {
		this.lineWidth = newWidth;
	}
	public static void zeroCount() {
		circleCount = 0;
	}
	public static int getCount() {
		return circleCount;
	}
}