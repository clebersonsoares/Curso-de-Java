import java.util.Scanner;

public class ExercicioEstruturaRepeticao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y;
		do {
			x = sc.nextInt();
			y = sc.nextInt();
			if(x > 0 && y > 0) {
				System.out.println("primeiro");
			}else if(x < 0 && y > 0) {
				System.out.println("segundo");
			}else if(x < 0 && y < 0) {
				System.out.println("terceiro");
			}else if(x > 0 && y < 0) {
				System.out.println("quarto");
			}else {
				System.out.println("");
			}
			
		}while(x != 0 && y != 0);
		sc.close();

	}

}
