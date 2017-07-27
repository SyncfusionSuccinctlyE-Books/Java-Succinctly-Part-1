1: import java.util.Scanner;
2: public class MainClass {
3: 	public static void main(String[] args) {
4: 		Scanner scanner = new Scanner(System.in);
5: 		System.out.println("What is your name?");
6: 		String str = scanner.nextLine();
7: 		System.out.println("Nice to meet you, " + str + "!");
8: 	}
9: }