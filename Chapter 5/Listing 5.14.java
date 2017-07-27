public class MainClass {
	public static void main(String[] args) {
		// Declare 4D array
		int[][][][] arr4D = new int[3][4][5][6];

		// Set all the elements to 1729
		for(int a = 0; a < 3; a++) {
			for(int b = 0; b < 4; b++) {
				for(int c = 0; c < 5; c++) {
					for(int d = 0; d < 6; d++) {
						arr4D[a][b][c][d] = 1729; 
					}
				}
			}
		}
	}
}