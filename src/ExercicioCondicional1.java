

import java.util.Scanner;

public class ExercicioCondicional1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String message = (x < 0 ) ? "Negativo" : "Não Negativo";
		System.out.println(message);
		sc.close();



	}

}
