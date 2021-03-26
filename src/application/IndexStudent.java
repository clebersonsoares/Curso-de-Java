package application;

import java.util.Locale;
import java.util.Scanner;

import Exercicios.Student;

public class IndexStudent {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		student.name = sc.nextLine();
		double nota = sc.nextDouble();
		student.addGrade(nota);
		nota = sc.nextDouble();
		student.addGrade(nota);
		nota = sc.nextDouble();
		student.addGrade(nota);
		student.checkSituation();
		System.out.println(student);
		
		sc.close();

	}

}
