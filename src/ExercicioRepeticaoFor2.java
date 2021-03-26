import java.util.Scanner;

public class ExercicioRepeticaoFor2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(),
			num = 0,
			in = 0,
			out = 0;
		for(int i = x ; i != 0; i--) {
			num = sc.nextInt();
			if(num >= 10 && num <= 20) {
				in += 1;
			}else {
				out += 1;
			}
		}
		System.out.println(in+" in");
		System.out.println(out+" out");
		sc.close();
	}

}
