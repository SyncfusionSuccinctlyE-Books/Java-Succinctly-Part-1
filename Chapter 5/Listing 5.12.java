public class MainClass {
	public static void main(String[] args) {
		float[][] array2d = new float[7][5];
		array2d[0][0] = 50.5f;
		array2d[4][4] = 60.5f;
		array2d[3][1] = 10.3f;
		System.out.println("Element (3, 1): " + array2d[3][1]);
		System.out.println("Element (4, 0): " + array2d[4][0]);
	}
}