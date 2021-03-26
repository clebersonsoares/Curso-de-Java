package application;

import java.util.Locale;
import java.util.Scanner;

import Exercicios.Employee;

public class IndexEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee func = new Employee();
		
		System.out.print("Name: ");
		func.name = sc.nextLine();
		System.out.print("\nGross Salary: ");
		func.grossSalary = sc.nextDouble();
		System.out.print("\nTax: ");
		func.tax = sc.nextDouble();
		System.out.println(func);
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		func.increaseSalary(percentage);
		System.out.println("Updated data: "+ func);
		sc.close();

	}

}
