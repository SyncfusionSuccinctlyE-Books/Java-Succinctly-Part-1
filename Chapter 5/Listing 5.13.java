public class MainClass {
	public static void main(String[] args) {

		float[][] array2d = new float[7][5];

		for(int y = 0; y < 5; y++) {
			for(int x = 0; x < 7; x++) {
				array2d[x][y] = x * y;
			}
		}
	}
}