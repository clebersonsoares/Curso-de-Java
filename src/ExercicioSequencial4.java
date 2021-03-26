import java.util.Locale;
import java.util.Scanner;

public class ExercicioSequencial4 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int number;
		double ht,h,salary;
		number = sc.nextInt();
		ht = sc.nextDouble();
		h = sc.nextDouble();
		salary = h*ht;
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f",number,salary);
		sc.close();
	}

}
