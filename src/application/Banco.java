package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta cliente;
		System.out.print("Enter account number: ");
		String conta = sc.nextLine();
		System.out.print("Enter account holder:");
		String name = sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)?");
		char test = sc.next().charAt(0);
		if(test == 'y'|| test == 'Y') {
			System.out.println("Enter initial deposit value:");
			double saldo = sc.nextDouble();
			 cliente = new Conta(conta,name,saldo);
		}else {
			cliente = new Conta(conta,name);
		}
		System.out.println("Account data: \n"+cliente);
		System.out.print("Enter a deposit value:");
		double value = sc.nextDouble();
		cliente.deposito(value);
		System.out.println("Updated account data:\n"+cliente);
		System.out.print("Enter a withdraw value:");
		value = sc.nextDouble();
		cliente.saque(value);
		System.out.println("Updated account data:\n"+cliente);
		sc.close();
	}
	

}
