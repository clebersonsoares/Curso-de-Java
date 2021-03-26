import java.util.Locale;
import java.util.Scanner;

public class ExercicioRepeticaoFor4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int vez = sc.nextInt();
		double n1,n2,result;
		for(int i = 1; i <= vez;i++) {
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			if(n2 == 0) {
				System.out.println("divisão impossível");
			}else {
				result = n1/n2;
				System.out.printf("%.1f%n", result);
			}
			
		}
		sc.close();
	}

}
