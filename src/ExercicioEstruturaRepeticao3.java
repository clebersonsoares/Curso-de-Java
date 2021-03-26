import java.util.Scanner;

public class ExercicioEstruturaRepeticao3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alcool = 0,
			gasolina = 0,
			disel = 0,
			tipoCombustivel;
		do {
			tipoCombustivel = sc.nextInt();
			switch(tipoCombustivel) {
			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				disel += 1;
				break;
			
			}
			
		}while(tipoCombustivel != 4);
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+alcool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Diesel: "+disel);
		sc.close();
	}
}
