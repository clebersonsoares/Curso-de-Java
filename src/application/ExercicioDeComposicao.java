package application;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enumm.WorkerLevel;

public class ExercicioDeComposicao {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Enter department's name:");
		String department = sc.next();
		System.out.println("Enter worker data:");
		System.out.println("Name : ");
		String workerName = sc.next();
		System.out.println("Level:");
		String workerLevel = sc.next();
		System.out.println("Base salary:");
		Double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName,WorkerLevel.valueOf(workerLevel), baseSalary, new Department(department));

		System.out.println("How many contracts to this worker?");
		int c = sc.nextInt();
		for(int i = 1; i <= c;i++) {
			System.out.println("Enter contract #"+i+" data:");
			System.out.println("Date (DD/MM/YYYY): ");
		    Date date = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			System.out.println("Duration (hours): ");
			Integer hours = sc.nextInt(); 
			HourContract hc = new HourContract(date, valuePerHour, hours);
			worker.addContract(hc);
			
		}
		System.out.println("Enter month and year to calculate income (MM/YYYY):");
		String date = sc.next();
		Integer month = Integer.parseInt(date.substring(0,2));
		Integer year = Integer.parseInt(date.substring(3));
		System.out.println("Name :"+worker.getName());
		System.out.println("Department :"+worker.getDepartment().getName());
		System.out.println("Income for "+month+"/"+year+":"+String.format("%.2f",worker.income(month, year)));
		
		
		


	}

}
