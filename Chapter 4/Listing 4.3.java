import java.util.Scanner;
public class MainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your age?");
		String age = scanner.nextLine();
		System.out.println("You are " + age + " years old!");
	}
}