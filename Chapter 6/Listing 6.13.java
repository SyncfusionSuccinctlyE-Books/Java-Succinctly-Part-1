public class MainClass {
	public static void main(String[] args) {
		MyClass someInstance = new MyClass();
		if(someInstance instanceof MyClass)
			System.out.println("someInstance is of MyClass!");
		else
			System.out.println("someInstance is not of MyClass...");
	}
}