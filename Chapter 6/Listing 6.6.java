public class MainClass {
	public static void main(String[] args) {
		float j = 901.0f/13.0f;
		float q = (53.0f / 13.0f)*17.0f;
		
		System.out.println("J: " + j + " Q:" + q);

		if(Math.abs(j - q) > 0.001f)
			System.out.println("The two are not equal!");
	}
}