package application;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número de linhas e colunas");
		int l = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("Digite os valores da sua MATRIZ ...");
		int[][] matriz = new int[l][c];
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("Digite o número a ser encontrado dentro da MATRIZ ...");
		int x = sc.nextInt();
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(x == matriz[i][j]) {
					System.out.println("POSITION  "+i+","+j);
					if(j > 0) {
						System.out.println("LEFT  :"+matriz[i][j-1]);
					}
					if(j > matriz[i][j-1]) {
						System.out.println("RIGHT  :"+matriz[i][j+1]);
					}
					if(i < matriz.length - 1) {
						System.out.println("DOWN  :"+matriz[i+1][j]);
					}
					
					if(i > 0) {
						System.out.println("UP  :"+matriz[i-1][j]);
					}
					
					System.out.println("--------------------------------");
					
					
					
				}
			}
		}
		
		sc.close();

	}

}
