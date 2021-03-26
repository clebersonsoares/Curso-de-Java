

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCondicional8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salario;
		
		salario = sc.nextDouble();

		if(salario >= 0 && salario <= 2000.00) {
			System.out.println("Isento");
		}else if(salario <= 3000.00) {
			System.out.printf("R$ %.2f", 0.08 *(salario - 2000.00));
		}else if(salario <= 4500.00) {
			System.out.printf("R$ %.2f",0.08 * (3000.00 - 2000.00)+ 0.18 * (salario - 3000.00));
		}else if(salario > 4500.00) {
			System.out.printf("R$ %.2f",0.08 * (3000.00 - 2000.00)+ 0.18 * (4500.00 - 3000.00)+ 0.28*(salario - 4500.00));
		}else System.out.println("Numero inválido");
		
		sc.close();

	}

}
