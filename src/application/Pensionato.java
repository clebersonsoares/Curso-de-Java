package application;

import java.util.Scanner;

import entities.Room;
import entities.Student;

public class Pensionato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rooms will be rented?");
		int person = sc.nextInt();
		Room[] room = new Room[10];
		sc.nextLine();
		Student[] student = new Student[person];
		int numberRoom;
		for (int i = 0; i < person; i++) {
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			student[i] = new Student(name,email);
			System.out.print("Room: ");
			numberRoom = sc.nextInt();
			sc.nextLine();
			room[numberRoom] = new Room();
			room[numberRoom].setNumber(numberRoom);
			room[numberRoom].setStudent(student[i]);
		}
		System.out.println("Busy rooms: ");
			for(int i = 0; i < 10; i++) {
				if(room[i] != null) {
					System.out.println(room[i].getStudent().toString());
				
				}
			}

		sc.close();

	}

}
