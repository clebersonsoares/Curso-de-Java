import java.util.Locale;
import java.util.Scanner;

public class ExercicioCondicional5 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod,quant;
		double total;
		cod = sc.nextInt();
		quant = sc.nextInt();
		switch (cod) {
		case 1:
			total = 4 * quant;
			System.out.printf("Total: R$ %.2f", total);
			break;
		case 2:
			total = 4.5 * quant;
			System.out.printf("Total: R$ %.2f", total);
			break;
		case 3:
			total = 5 * quant;
			System.out.printf("Total: R$ %.2f", total);
			break;
		case 4:
			total = 2 * quant;
			System.out.printf("Total: R$ %.2f", total);
			break;
		case 5:
			total = 1.5 * quant;
			System.out.printf("Total: R$ %.2f", total);
			break;
		default:
			System.out.println("Código digitado inválido!");
			break;
		}
		sc.close();

	}

}
