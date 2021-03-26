import java.util.Scanner;

public class ExercicioRepeticaoFor5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fat = sc.nextInt();
		if (fat == 0) {
			System.out.println(1);
		} else {
			int n = fat;
			for (int i = 1; i < fat; i++) {
				n = n * (fat - i);

			}
			System.out.println(n);
		}

		sc.close();

	}

}
