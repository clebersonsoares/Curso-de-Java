import java.util.Scanner;
public class ExercicioCondicional2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String message = (num % 2 == 0) ? "Par" : "Impar";
		System.out.println(message);
		sc.close();
	}
}
