import java.util.Scanner;

public class ExercicioCondicional4 {

	public static void main(String[] args) {
		int i,f,th;
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		f = sc.nextInt();
		th = (i < f) ? f - i : 24 - i + f;
		
		System.out.printf("O jogo durou %d hora(s)",th);
		sc.close();

	}

}
