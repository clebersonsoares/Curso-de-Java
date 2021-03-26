import java.util.Locale;
import java.util.Scanner;
public class ExercicioSequencial1{
	public static void main(String[] args) {
		/*
		 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
		 * soma desses números com uma mensagem explicativa, conforme exemplos.
		 */
		Locale.setDefault(Locale.US);
		int a,b,res;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		res = a+b;
		System.out.println("SOMA = "+res);
		sc.close();	
	}
}