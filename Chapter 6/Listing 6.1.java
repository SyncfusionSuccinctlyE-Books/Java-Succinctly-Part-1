public class MainClass {
	public static void main(String[] args) {
		int j = 190;		// j gets 190
		j++;				// j gets 191
		j = j - 89;			// j gets 102
		int b = 78 * j;		// b gets 7956
		int c = b + (9*j) / 12;	// c gets 8032
		b--;				// b gets 7955
		c = c % b + (j / 2);    // c gets 128
		c = --b;			// c and b get 7954
		int h = (j + b) % 210;  // h gets 76
	}
}