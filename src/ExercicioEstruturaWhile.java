import java.util.Scanner;

public class ExercicioEstruturaWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int acesso = 2002,senha = 0;
		
		while(senha != acesso) {
			senha = sc.nextInt();
			if(senha == acesso) {
				System.out.println("Acesso Permitido");
			}else System.out.println("Senha Inválida");
		}
		sc.close();
	}

}
