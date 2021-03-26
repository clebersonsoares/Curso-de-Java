import java.util.Locale;
import java.util.Scanner;

public class ExercicioSequencial6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a,b,c,tri,cir,tra,qua,ret;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		tri = a*c/2;
		cir = 3.14159*(Math.pow(c, 2));
		tra = (a+b)*c/2;
		qua = Math.pow(b,2);
		ret = a*b;
		System.out.printf("TRIÂNGULO: %.3f%n"
				+ "CIRCÚLO: %.3f%nTRAPÉZIO: %.3f%n"
				+ "QUADRADO: %.3f%nRETÂNGULO: %.3f%n",tri,cir,tra,qua,ret);
		sc.close();

	}

}
