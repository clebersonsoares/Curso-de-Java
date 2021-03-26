package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class RegisterEmployees {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("How many employees will be registered?");
		Integer value = sc.nextInt();
		List <Employee> employee = new ArrayList<>();
		for(int i = 1;i <= value;i++) {
			System.out.println("Employee #"+i);
			System.out.print("Id:");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name:");
			String name = sc.nextLine();
			
			System.out.print("Salary:");
			double salary = sc.nextDouble();
			Employee obj = new Employee(id, name, salary);
			employee.add(obj);
		}
		System.out.println("Enter the employee id that will have salary increase :");
		Integer v = sc.nextInt();
		List<Employee> result = employee.parallelStream().filter(x ->x.getId() == v).collect(Collectors.toList());
		if(result.isEmpty()) {
			System.out.println("Id inválido! Não temos um funcionario com este id veja");
			System.out.println("ID  EMPLOYEES  SALARY");
			for(Employee x : employee) {
				System.out.println(x.toString());
			}
		}else {
			System.out.println("Enter the percentage:");
			double percetage = sc.nextDouble();
			for(Employee x : result) {
				x.salaryIncrease(percetage);
			}
			System.out.println("ID  EMPLOYEES  SALARY");

			for(Employee x : employee) {
				System.out.println(x.toString());
			}
		}

		sc.close();

	}

}
