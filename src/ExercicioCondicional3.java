import java.util.Scanner;

public class ExercicioCondicional3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		String message = "";
		a = sc.nextInt();
		b = sc.nextInt();
		message = (a % b == 0 || b % a == 0) ? "São multiplos" : "Não são multiplos";
		System.out.println(message);
		
		sc.close();
	}

}
