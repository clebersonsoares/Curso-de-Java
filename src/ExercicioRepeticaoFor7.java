import java.util.Scanner;

public class ExercicioRepeticaoFor7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double qua = 0,cubo = 0;
		for(int i = 1; i <= x;i++) {
			qua = Math.pow(i,2);
			cubo = Math.pow(i,3);
			System.out.printf("%d %.0f %.0f %n",i,qua,cubo);
		}
		sc.close();
	}

}
