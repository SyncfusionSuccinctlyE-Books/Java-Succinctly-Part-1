import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int height = 0;
		System.out.print("How tall are you (in cm)? ");
		height = Integer.parseInt(scanner.nextLine());
		
		if(height < 100) {
			System.out.println("Wow! Are you a quokka?");
		}
		
		if(height > 300)
			System.out.println("Yeah right? Are you a giraffe?");
		
	}
}