import java.util.Locale;
import java.util.Scanner;

public class ExercicioRepeticaoFor3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int vez = sc.nextInt();
		double  n1,n2,n3,mp;
		for(int i = 1; i < vez; i++) {
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			n3 = sc.nextDouble();
			mp = (n1*2+n2*3+n3*5)/(2+3+5);
			System.out.printf("%.1f",mp);
		}
		sc.close();
		
	}

}
