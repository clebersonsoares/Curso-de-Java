import java.util.Locale;
import java.util.Scanner;

public class ExercicioSequencial5 {
	public static void main(String[] args) {
		int qt1,qt2;
		double val1,val2,total;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		qt1 = sc.nextInt();
		val1 = sc.nextDouble();
		qt2 = sc.nextInt();
		val2 = sc.nextDouble();
		total = (qt1*val1) + (qt2*val2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f",total);
		sc.close();
		
	}
}
